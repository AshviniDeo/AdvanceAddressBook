package advanceaddressbook.AddressBook.cotroller;

import advanceaddressbook.AddressBook.entity.PersonContact;
import advanceaddressbook.AddressBook.service.IPersonService;
import advanceaddressbook.AddressBook.serviceimpl.PersonServiceImpl;
import advanceaddressbook.AddressBook.utility.UtilScanner;

public class DashBoard {
	PersonServiceImpl serve = new PersonServiceImpl();

	public void showMenu() {

		boolean exit = false;
		while (!exit) {
			System.out.println(":: Welcome to AddressBook ::");
			System.out.println(" :: Main Menu ::");
			System.out.println("  1.Add Contact \n  2.Edit Contact\n");
			int choice = UtilScanner.getInt(" Your Choice : ");

			switch (choice) {
			case 1:
				addDetails();
				break;

			case 2:
				editDetails();
				break;

			default:
				break;
			}

		}

	}

	private void editDetails() {
		String name = UtilScanner.getString(" Person Name to Update : ");
		PersonContact update = serve.getPerson(name);
		boolean exit = false;
		while (!exit) {
			System.out.println(" :: Details To update :: \n 1.First Name \n 2.Second Name \n 3.Address \n 4.City\n 5.State\n 6.Zipcode\n 7.Phone Number \n 8.Email \n 9.Exit");
			int choice = UtilScanner.getInt(" Enter Choice : ");
			switch (choice) {
			case 1: String fname = UtilScanner.getString(" First Name : ");
				update.setFname(fname);
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
