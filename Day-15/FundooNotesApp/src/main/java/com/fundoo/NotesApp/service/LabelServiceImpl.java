package com.fundoo.NotesApp.service;

import com.fundoo.NotesApp.dto.LabelRequest;
import com.fundoo.NotesApp.dto.LabelResponse;
import com.fundoo.NotesApp.entity.Note;
import com.fundoo.NotesApp.entity.NoteLabel;
import com.fundoo.NotesApp.repository.NoteLabelRepository;
import com.fundoo.NotesApp.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LabelServiceImpl implements LabelService {

    private final NoteLabelRepository labelRepository;
    private final NoteRepository noteRepository;

    @Override
    public LabelResponse createLabel(Long userId, LabelRequest request) {
        labelRepository.findByUserIdAndLabelName(userId, request.getLabelName())
                .ifPresent(l -> { throw new IllegalArgumentException("Label already exists"); });

        NoteLabel label = NoteLabel.builder()
                .labelName(request.getLabelName())
                .userId(userId)
                .build();

        NoteLabel saved = labelRepository.save(label);
        return new LabelResponse(saved.getLabelId(), saved.getLabelName());
    }

    @Override
    public List<LabelResponse> getAllLabels(Long userId) {
        return labelRepository.findByUserId(userId)
                .stream()
                .map(l -> new LabelResponse(l.getLabelId(), l.getLabelName()))
                .collect(Collectors.toList());
    }

    @Override
    public void addLabelToNote(Long userId, Long noteId, Long labelId) {
        Note note = getOwnedNote(userId, noteId);
        NoteLabel label = getOwnedLabel(userId, labelId);
        label.getNotes().add(note);
        labelRepository.save(label);
    }

    @Override
    public void removeLabelFromNote(Long userId, Long noteId, Long labelId) {
        Note note = getOwnedNote(userId, noteId);
        NoteLabel label = getOwnedLabel(userId, labelId);
        label.getNotes().remove(note);
        labelRepository.save(label);
    }

    private Note getOwnedNote(Long userId, Long noteId) {
        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new IllegalArgumentException("Note not found"));
        if (!note.getUserId().equals(userId)) {
            throw new SecurityException("Not authorized for this note");
        }
        return note;
    }

    private NoteLabel getOwnedLabel(Long userId, Long labelId) {
        NoteLabel label = labelRepository.findById(labelId)
                .orElseThrow(() -> new IllegalArgumentException("Label not found"));
        if (!label.getUserId().equals(userId)) {
            throw new SecurityException("Not authorized for this label");
        }
        return label;
    }
}
