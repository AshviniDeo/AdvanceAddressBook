package advanceaddressbook.AddressBook.utility;

import java.util.Scanner;

public class UtilScanner {
 public static Scanner scanner = new Scanner(System.in);
 
 public static int getInt(String message) {
		message(message);
		return scanner.nextInt();
	}
 
 public static String getString(String message) {
		message(message);
		return scanner.next();
	}

private static void message(String message) {
	System.out.println("Enter the" + message);
	
}
}
