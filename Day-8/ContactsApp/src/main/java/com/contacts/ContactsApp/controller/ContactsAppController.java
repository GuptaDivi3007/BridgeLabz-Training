package com.contacts.ContactsApp.controller;

import com.contacts.ContactsApp.dto.RequestDTO;
import com.contacts.ContactsApp.dto.ResponseDTO;
import com.contacts.ContactsApp.service.ContactsAppServiceImpl;

import java.util.List;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contacts")
@RequiredArgsConstructor
public class ContactsAppController {

    private final ContactsAppServiceImpl contactService;

    @GetMapping
    public ResponseEntity<List<ResponseDTO>> getAllContacts(){
        return ResponseEntity.ok(contactService.getAllContacts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getContactById(@PathVariable Long id){
        return ResponseEntity.ok(contactService.getContactById(id));
    }

    @PostMapping
    public ResponseEntity<ResponseDTO> createContact(@Valid @RequestBody RequestDTO requestDTO){
        ResponseDTO response = contactService.createContact(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDTO> updateContact(@PathVariable Long id, @Valid @RequestBody RequestDTO requestDTO){
        ResponseDTO response = contactService.updateContact(id, requestDTO);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id){
        contactService.deleteContact(id);
        return ResponseEntity.noContent().build();
    }
}