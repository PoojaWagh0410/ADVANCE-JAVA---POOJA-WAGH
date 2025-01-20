package com.qspiders.contactmanager.data;

import java.util.Scanner;

import com.qspiders.contactmanager.entity.Contact;

public class DataImplementation implements Data {

	private Contact[] contacts = new Contact[10];

	private int capacity = contacts.length;

	private int index = 0;

	@Override
	public void addContact(Contact contact) {
		if (checkContactPresentOrNot(contact)) {
			System.out.println("Contact already present...");
		} else {
			if (index == (capacity - 1)) {
				Contact[] temp = new Contact[capacity * 2];
				for (int i = 0; i < index; i++) {
					temp[i] = contacts[i];
				}
				contacts = temp;
				capacity = contacts.length;
			}
			contacts[index] = contact;
			index++;
			System.out.println("Contact Added");
		}
	}

	@Override
	public void deleteContact(int id) {
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if (contacts[i].getId() == id) {
				flag = true;
				contacts[i] = null;
				normalize(i);
				break;
			}
		}
		if (flag) {
			System.out.println("Contact with id : " + id + " is deleted sucessfully");
		} else {
			System.err.println("Invalid id");
		}
	}

	@Override
	public Contact[] findAllContacts() {
		Contact[] temp = new Contact[index];
		for (int i = 0; i < index; i++) {
			temp[i] = contacts[i];
		}
		return temp;
	}

	@Override
	public Contact findContactById(int id) {
		Contact contact = null;
		for (int i = 0; i < index; i++) {
			if (contacts[i].getId() == id) {
				contact = contacts[i];
				break;
			}
		}
		return contact;
	}

	private void normalize(int i) {
		if (i == index - 1) {
			index--;
		} else {
			for (int j = i; j < index - 1; j++) {
				contacts[j] = contacts[j + 1];
			}
			index--;
		}
	}

	private boolean checkContactPresentOrNot(Contact contact) {
		boolean present = false;
		for (int i = 0; i < index; i++) {
			if (contacts[i].getEmail().equals(contact.getEmail()) || contacts[i].getMobile() == contact.getMobile()
					|| contacts[i].getWork() == contact.getWork()) {
				present = true;
				break;
			}
		}
		return present;
	}

}
