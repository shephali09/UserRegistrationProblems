package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = scanner.nextLine();

		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Pattern matches");
		} else {
			System.out.println("Pattern not matches");
		}

	}
}