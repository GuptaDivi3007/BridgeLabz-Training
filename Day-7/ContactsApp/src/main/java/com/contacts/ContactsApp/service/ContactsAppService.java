package com.contacts.ContactsApp.service;

import com.contacts.ContactsApp.dto.ResponseDTO;
import com.contacts.ContactsApp.entity.ContactsApp;
import com.contacts.ContactsApp.repository.ContactsAppRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactsAppService implements ContactsAppInterface{

    private final ContactsAppRepository contactsAppRepository;

    public ContactsAppService(ContactsAppRepository contactsAppRepository) {
        this.contactsAppRepository = contactsAppRepository;
    }

    @Override
    public ResponseDTO add(ContactsApp contactsAppReq){
        ContactsApp cont = contactsAppRepository.save(contactsAppReq);
        ResponseDTO res = ResponseDTO.builder().name(cont.getName()).id(cont.getId()).email(cont.getEmail()).mobNo(cont.getMobNo()).build();
        return res;
    }
}