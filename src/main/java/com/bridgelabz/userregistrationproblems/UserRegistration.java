package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		String firstNameRegex = "^([A-Z][a-z]{3,})*$";
		System.out.println("Enter first name: ");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();

		Pattern pattern = Pattern.compile(firstNameRegex);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Pattern matches");
		} else {
			System.out.println("Pattern not matches");
		}

	}

}
