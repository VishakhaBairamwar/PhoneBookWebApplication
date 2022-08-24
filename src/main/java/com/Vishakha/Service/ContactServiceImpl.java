package com.Vishakha.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vishakha.Repository.ContactRepository;
import com.Vishakha.model.Contact;




@Service
public class ContactServiceImpl implements ContactServiceI  {

	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {
		Contact save = contactRepository.save(contact);

		if (save != null) {
			return true;
		} else {
			return false;
		}
	}

	
}
