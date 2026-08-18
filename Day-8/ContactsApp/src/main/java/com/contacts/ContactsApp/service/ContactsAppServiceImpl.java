package com.contacts.ContactsApp.service;

import com.contacts.ContactsApp.dto.RequestDTO;
import com.contacts.ContactsApp.dto.ResponseDTO;
import com.contacts.ContactsApp.entity.ContactsApp;
import com.contacts.ContactsApp.exception.ContactNotFoundException;
import com.contacts.ContactsApp.exception.DuplicateEmailException;
import com.contacts.ContactsApp.mapper.ContactMapper;
import com.contacts.ContactsApp.repository.ContactsAppRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ContactsAppServiceImpl implements ContactsAppService {

    private final ContactsAppRepository contactRepository;

    private final ContactMapper contactMapper;

    @Override
    public List<ResponseDTO> getAllContacts(){
        log.info("Fetching all contacts");
        return contactRepository.findAll()
                .stream()
                .map(contactMapper::toResponseDTO) //WHY
                .toList();
    }

    @Override
    public ResponseDTO getContactById(Long id){
        log.info("Fetching contact with id: {}",id);
        ContactsApp contact = contactRepository.findById(id).orElseThrow(
                ()->{
                    log.warn("Contact not found with id: {}",id);
                    return new ContactNotFoundException(id);
                }
        );
        return contactMapper.toResponseDTO(contact);
    }

    @Override
    public ResponseDTO createContact(RequestDTO requestDTO){
        log.info("Creating contact with email: {}",requestDTO.getEmail());

        if(contactRepository.existsByEmail(requestDTO.getEmail())){
            log.warn("Cannot create - contact with with same email: {}",requestDTO.getEmail());
            throw new DuplicateEmailException(requestDTO.getEmail());
        }

        ContactsApp contact = contactMapper.toEntity(requestDTO);
        ContactsApp savedContact = contactRepository.save(contact);

        log.info("Contact created with id: {}", savedContact.getId());

        return contactMapper.toResponseDTO(savedContact);
    }

    @Override
    public ResponseDTO updateContact(Long id,RequestDTO requestDTO){
        log.info("Updating contact with id: {}",id);

        //Finding the contact entity by its id, orElse throwing an Exception
        ContactsApp existingContact = contactRepository.findById(id).orElseThrow(
                ()->{
                    log.warn("Cannot update - contact not found with id: {}", id);
                    return new ContactNotFoundException(id);
                }
        );
        //Throwing exception if duplicate email already exists, before updating with the same email
        if(contactRepository.existsByEmail(requestDTO.getEmail())){
            log.warn("Cannot update - contact found with same email: {}",requestDTO.getEmail());
            throw new DuplicateEmailException(requestDTO.getEmail());
        }
        //Updating the fields
        existingContact.setName(requestDTO.getName());
        existingContact.setEmail(requestDTO.getEmail());
        existingContact.setPhone(requestDTO.getPhone());

        //Saving the updated Entity
        ContactsApp updatedContact = contactRepository.save(existingContact);
        log.info("Contact updated with id: {}", updatedContact.getId());

        //returning and converting Entity to DTO by calling method from mapper
        return contactMapper.toResponseDTO(updatedContact);
    }

    @Override
    public void deleteContact(Long id){
        log.info("Deleting contact with id: {}",id);
        if(!contactRepository.existsById(id)){
            log.warn("Cannot delete - contact not found with id: {}", id);
            throw new ContactNotFoundException(id);
        }
        contactRepository.deleteById(id);
        log.info("Contact deleted with id: {}", id);
    }
}