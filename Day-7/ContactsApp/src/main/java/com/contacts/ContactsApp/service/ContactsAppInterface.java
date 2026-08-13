package com.contacts.ContactsApp.service;

import com.contacts.ContactsApp.dto.ResponseDTO;
import com.contacts.ContactsApp.entity.ContactsApp;

public interface ContactsAppInterface {

    public ResponseDTO add(ContactsApp contactsAppReq);
}