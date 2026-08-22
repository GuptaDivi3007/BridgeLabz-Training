package com.fundoo.NotesApp.controller;

import com.fundoo.NotesApp.service.NotesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/notes")
public class NotesController {

    private final NotesService notesService;

    @GetMapping
    public String isRunning(){
        return notesService.isRunning();
    }
}
