package com.revature.main;

import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.beans.Employee;
import com.revature.services.*;

public class BankingApp {
	private static Scanner scanner = new Scanner(System.in);
	private static Customer loggedCustomer;
	private static Employee loggedEmployee;
	private static CustomerService cs = new CustomerServiceImpl();
	private static EmployeeService es = new EmployeeServiceImpl();
//	private static TransactionService ts = new TransactionServiceImpl();
//	private static AccountService as = new AccountServiceImpl();

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		boolean menu = true; // the main menu is on if true

		while (menu) {
			System.out.println("Welcome to the Bank of Ecelbarger\n" + "Choose any of the options below:");
			System.out.println("1.) Login\n" + "2.) Register\n" + "3.) Employee Login\n" + "4.) Quit");

			int ans = Integer.valueOf(scanner.nextLine());

			switch (ans) {
			case 1:
				 login();
				break;
			case 2:
				// register
				break;
			case 3:
				 loginEmployee();
				break;
			case 4:
				System.out.println("Thank you for stopping by! Enjoy your day.");
				menu = false;
				break;

			default:
				break;
			}
		}

		scanner.close();
	}

	private static void login() {
		loggedCustomer = cs.login(scanner);

		if (loggedCustomer == null) {
			System.out.println("Incorrect Login, please try again");
		} else {
			System.out.println("Login successfull!\n");
			customerOptions();
		}
	}

	private static void loginEmployee() {
		loggedEmployee = es.login(scanner);

		if (loggedEmployee == null) {
			System.out.println("Incorrect Login, please try again");
		} else {
			System.out.println("Login successfull!\n");
			employeeOptions();
		}
	}
	
	private static void customerOptions() {
		
		boolean cOptions = true;
		
		
	}
	
	private static void employeeOptions() {

	}
}
