package com.fundoo.NotesApp.service;

import com.fundoo.NotesApp.dto.LabelRequest;
import com.fundoo.NotesApp.dto.LabelResponse;

import java.util.List;

public interface LabelService {

    LabelResponse createLabel(Long userId, LabelRequest request);

    List<LabelResponse> getAllLabels(Long userId);

    void addLabelToNote(Long userId, Long noteId, Long labelId);

    void removeLabelFromNote(Long userId, Long noteId, Long labelId);
}
