package com.Vishakha.Service;

import java.util.List;

import com.Vishakha.model.Contact;

public interface ContactServiceI {
	
	boolean saveContact(Contact contact);
	List<Contact> getAllContact();
	
	Contact getContactById(Integer cid);
	
	public boolean updateContact(Contact contact);
}
