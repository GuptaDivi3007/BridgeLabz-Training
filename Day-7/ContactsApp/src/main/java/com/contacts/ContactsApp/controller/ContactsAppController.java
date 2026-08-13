package com.contacts.ContactsApp.controller;

import com.contacts.ContactsApp.dto.RequestDTO;
import com.contacts.ContactsApp.dto.ResponseDTO;
import com.contacts.ContactsApp.entity.ContactsApp;
import com.contacts.ContactsApp.service.ContactsAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contactApp")
public class ContactsAppController {

    @Autowired
    private final ContactsAppService contactsAppService ;

    public ContactsAppController( ContactsAppService contactsAppService) {
        this.contactsAppService = contactsAppService;
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> create(@RequestBody RequestDTO req) {

        ContactsApp contact = ContactsApp.builder().name(req.getName()).email(req.getEmail()).mobNo(req.getMobNo()).build();
        ResponseDTO ans = contactsAppService.add(contact) ;

        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(ans);
    }
}