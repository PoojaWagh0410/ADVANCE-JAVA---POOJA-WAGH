package com.qspiders.contactmanager.data;

import com.qspiders.contactmanager.entity.Contact;

public interface Data {

	void addContact(Contact contact);

	void deleteContact(int id);

	Contact findContactById(int id);

	Contact[] findAllContacts();

}
