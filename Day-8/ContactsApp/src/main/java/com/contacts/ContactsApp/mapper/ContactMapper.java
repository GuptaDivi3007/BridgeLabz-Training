package com.contacts.ContactsApp.mapper;

import com.contacts.ContactsApp.dto.RequestDTO;
import com.contacts.ContactsApp.dto.ResponseDTO;
import com.contacts.ContactsApp.entity.ContactsApp;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {
    //Request DTO -> Entity
    public ContactsApp toEntity(RequestDTO requestDTO){

        ContactsApp contact = new ContactsApp();
        contact.setName(requestDTO.getName());
        contact.setPhone(requestDTO.getPhone());
        contact.setEmail(requestDTO.getEmail());
        return contact;
    }

    //Entity -> Response DTO
    public ResponseDTO toResponseDTO(ContactsApp contact) {
        return new ResponseDTO(contact.getId(), contact.getName(), contact.getPhone(), contact.getEmail());
    }
}