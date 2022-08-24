package com.Vishakha.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

	@Override
	public List<Contact> getAllContact() {
		
	List<Contact> contacts = contactRepository.findAll();
	
	Stream<Contact> stream = contacts.stream();
	        Stream<Contact> filter = stream.filter(contact -> contact.getActiveSwitch() =='Y');
	        		List<Contact> collect = filter.collect(Collectors.toList());
	
	return collect;
}

	@Override
	public Contact getContactById(Integer cid) {
		Contact findById = contactRepository.findById(cid).get();
		return findById;
	}

	
}
