package advanceaddressbook.AddressBook.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

import advanceaddressbook.AddressBook.entity.PersonContact;
import advanceaddressbook.AddressBook.service.IPersonService;

public class PersonServiceImpl implements IPersonService {

	List<PersonContact> contact = new ArrayList<PersonContact>();
    MultiMap<String, PersonContact> book = new MultiValueMap();
    
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

	public void addToAddressBook(String name, PersonContact person) {
		book.put(name, person);
		
		for (Entry<String, Object> personContact : book.entrySet()) {
			System.out.println(personContact.getKey());
		}
	}
	
	

}
