package com.contacts.ContactsApp.service;

import com.contacts.ContactsApp.dto.RequestDTO;
import com.contacts.ContactsApp.dto.ResponseDTO;

import java.util.List;

public interface ContactsAppService {

    List<ResponseDTO> getAllContacts();

    ResponseDTO getContactById(Long id);

    ResponseDTO createContact(RequestDTO requestDTO);

    ResponseDTO updateContact(Long id,RequestDTO requestDTO);

    void deleteContact(Long id);
}