package advanceaddressbook.AddressBook.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import advanceaddressbook.AddressBook.entity.PersonContact;
import advanceaddressbook.AddressBook.service.IPersonService;

public class PersonServiceImpl implements IPersonService{

	List <PersonContact> contact = new ArrayList<PersonContact>();
	@Override
	public void addPerson(PersonContact person) {
		contact.add(person);
		System.out.println(contact.size());
		for (PersonContact personContact : contact) {
			System.out.println(personContact.toString());
		}
	}

}
