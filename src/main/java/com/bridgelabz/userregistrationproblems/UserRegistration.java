package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		String emailRegex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";
		System.out.println("Enter Email: ");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.nextLine();

		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Pattern matches");
		} else {
			System.out.println("Pattern not matches");
		}

	}

}
