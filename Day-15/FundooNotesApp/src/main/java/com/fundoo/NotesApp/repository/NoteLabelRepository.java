package com.fundoo.NotesApp.repository;

import com.fundoo.NotesApp.entity.NoteLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoteLabelRepository extends JpaRepository<NoteLabel, Long> {

    List<NoteLabel> findByUserId(Long userId);

    Optional<NoteLabel> findByUserIdAndLabelName(Long userId, String labelName);
}
