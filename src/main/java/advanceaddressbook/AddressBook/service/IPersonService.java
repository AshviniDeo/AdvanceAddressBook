package advanceaddressbook.AddressBook.service;

import advanceaddressbook.AddressBook.entity.PersonContact;

public interface IPersonService {

	void addPerson(PersonContact person);
	PersonContact getPerson(String name);
	public void deletePerson(PersonContact name);
}
