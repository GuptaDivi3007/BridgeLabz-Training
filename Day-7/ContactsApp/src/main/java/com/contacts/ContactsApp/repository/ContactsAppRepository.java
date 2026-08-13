package com.contacts.ContactsApp.repository;

import com.contacts.ContactsApp.entity.ContactsApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsAppRepository extends JpaRepository<ContactsApp,Integer> {
}