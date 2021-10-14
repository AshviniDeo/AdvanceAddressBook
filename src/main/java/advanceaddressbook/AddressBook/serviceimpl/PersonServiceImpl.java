package advanceaddressbook.AddressBook.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import advanceaddressbook.AddressBook.entity.PersonContact;
import advanceaddressbook.AddressBook.service.IPersonService;

public class PersonServiceImpl implements IPersonService {

	List<PersonContact> contact = new ArrayList<PersonContact>();

	@Override
	public void addPerson(PersonContact person) {
		contact.add(person);
		for (PersonContact personContact : contact) {
			System.out.println(personContact.toString());
		}
	}

	public PersonContact getPerson(String name) {
		for (PersonContact personContact : contact) {
			if (personContact.getFname().equals(name)) {
				return personContact;
			}
		}
		return null;
	}

	public void deletePerson(PersonContact name) {
		contact.remove(name);
	}
	
	

}
