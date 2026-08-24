package com.fundoo.NotesApp.service;

import com.fundoo.NotesApp.dto.NoteRequest;
import com.fundoo.NotesApp.dto.NoteResponse;

import java.util.List;

public interface NoteService {

    NoteResponse createNote(Long userId, NoteRequest request);

    List<NoteResponse> getAllNotes(Long userId);

    NoteResponse updateNote(Long userId, Long noteId, NoteRequest request);

    void deleteNote(Long userId, Long noteId);
}
