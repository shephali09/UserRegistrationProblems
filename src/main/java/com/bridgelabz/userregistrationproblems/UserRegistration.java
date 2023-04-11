package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
		System.out.println("Enter Password: ");
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();

		Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matcher = pattern.matcher(password);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Pattern matches");
		} else {
			System.out.println("Pattern not matches");
		}

	}
}