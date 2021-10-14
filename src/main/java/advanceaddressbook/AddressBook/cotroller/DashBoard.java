package advanceaddressbook.AddressBook.cotroller;

import advanceaddressbook.AddressBook.entity.PersonContact;
import advanceaddressbook.AddressBook.service.IPersonService;
import advanceaddressbook.AddressBook.serviceimpl.PersonServiceImpl;
import advanceaddressbook.AddressBook.utility.UtilScanner;

public class DashBoard {
	PersonServiceImpl serve = new PersonServiceImpl();

	public void showMenu() {
		
		boolean exit = false;
		while(!exit) {
		System.out.println(":: Welcome to AddressBook ::");
		System.out.println(" :: Main Menu ::");
		System.out.println("  1.Add Contact \n");
		int choice = UtilScanner.getInt(" Your Choice : ");
		
		switch (choice) {
		case 1: addDetails();
			
			break;

		default:
			break;
		}
		
		}
		
	}
	
	public static void main(String[] args) {
		DashBoard menu = new DashBoard();
		menu.showMenu();
	}

	private void addDetails() {
		PersonContact person = new PersonContact();
		person.setFname(UtilScanner.getString(" First Name : "));
		person.setLname(UtilScanner.getString(" Second Name : "));
		person.setAddress(UtilScanner.getString(" Address : "));
		person.setCity(UtilScanner.getString(" City Name : "));
		person.setState(UtilScanner.getString(" State Name : "));
		person.setZipcode(UtilScanner.getString(" Zipcode : "));
		person.setPhone(UtilScanner.getString(" Phone Number : "));
		person.setEmail(UtilScanner.getString(" Email : "));
		serve.addPerson(person);
		
	}
}
