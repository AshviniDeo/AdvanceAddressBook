package advanceaddressbook.AddressBook.serviceimpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

import advanceaddressbook.AddressBook.entity.PersonContact;
import advanceaddressbook.AddressBook.service.IPersonService;

public class PersonServiceImpl implements IPersonService {

	List<PersonContact> contact = new ArrayList<PersonContact>();
	MultiMap<String, PersonContact> book = new MultiValueMap();
	Set<PersonContact> element = new HashSet<PersonContact>();

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

		element.add(person);
		
			if (!book.containsValue(element)) {
				book.put(name, element);
			}
			
		System.out.println(book.toString());

		for (Entry<String, Object> personContact : book.entrySet()) {
			System.out.println("Addressbook->" + personContact.getKey());
		}
	}

	public void searchContact(String data) {
		element.stream().forEach(a->{if(a.getCity().equals(data) || a.getState().equals(data)) System.out.println(a);});
	for (PersonContact personContact : element) {
		if(personContact.getCity().equals(data) || personContact.getState().equals(data)) {
			System.out.println(personContact);
		}
	}
		
	}

	

}
