package com.contacts.ContactsApp.repository;

import com.contacts.ContactsApp.entity.ContactsApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsAppRepository extends JpaRepository<ContactsApp, Long> {
    boolean existsByEmail(String email);
}