package com.Vishakha.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Vishakha.model.Contact;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
