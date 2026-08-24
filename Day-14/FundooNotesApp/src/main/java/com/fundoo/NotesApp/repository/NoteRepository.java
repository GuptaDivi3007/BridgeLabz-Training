package com.fundoo.NotesApp.repository;

import com.fundoo.NotesApp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

    List<Note> findByUserIdAndIsDeletedFalse(Long userId);
}
