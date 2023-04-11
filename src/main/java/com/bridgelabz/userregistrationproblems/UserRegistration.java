package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		String lastNameRegex = "^([A-Z][a-zA-Z]{3,})$";
		System.out.println("Enter last name: ");
		Scanner scanner = new Scanner(System.in);
		String lastName = scanner.nextLine();

		Pattern pattern = Pattern.compile(lastNameRegex);
		Matcher matcher = pattern.matcher(lastName);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Pattern matches");
		} else {
			System.out.println("Pattern not matches");
		}

	}

}
