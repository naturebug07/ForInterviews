package com.placements.arraysAndLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	static ArrayList<Contacts> contactsDetailsList= new ArrayList<Contacts>();
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		String quit="yes";
		while (quit.equalsIgnoreCase("yes")){
			System.out.println("press option number");
			System.out.println("1. Add contact");
			System.out.println("2. Print all contacts");
			System.out.println("3. Search contact by name");
			System.out.println("4. Quit");
			int option = scanner.nextInt();
			Contacts contact=new Contacts();
			switch (option){
				case 1:
					System.out.println("enter name");
					contact.setName(scanner.next());
					System.out.println("enter phone");
					contact.setPhoneNumber(scanner.next());
					contactsDetailsList.add(contact);
					break;
				case 2:
					System.out.println("Your contact list is");
					int i=1;
					for (Contacts x:contactsDetailsList) {

						System.out.println(i);
						System.out.println("Name ::"+x.name);
						System.out.println("Phone ::"+x.phoneNumber);
						i++;
					}
					break;
				case 3:
					System.out.println("enter name of contact to search");
					String nameTosearch= scanner.next();
					int j=1;
					for (Contacts x:contactsDetailsList) {
						System.out.println(j);

						if (x.getName().equalsIgnoreCase(nameTosearch)) {
							System.out.println("OK here is your contact details");
							System.out.print("Name::"+x.name+"\n");
							System.out.print("Phone::"+x.phoneNumber +"\n");
							System.out.println("1. Update existing contact");
							System.out.println("2. Delete existing contact");
							System.out.println("3. Home");
							int opt=scanner.nextInt();

							switch (opt){
								case 1:
									System.out.println("enter name");
									contactsDetailsList.get(j-1).setName(scanner.next());
									System.out.println("enter phone");
									contactsDetailsList.get(j-1).setPhoneNumber(scanner.next());
									break;
								case 2:
									System.out.println(j);
									contactsDetailsList.remove((j-1));
									System.out.println("contact deleted");
									break;
								case 3:
									break;
							}


						}
						else if (j== contactsDetailsList.size()) {
							System.out.println("oops! you might not have added this contact,press 1 to add");
						}
						j++;
					}
					break;
				case 4:

					quit="quit";
					break;
				default:
					System.out.println("invalid choice");
			}

		}
	}
}
