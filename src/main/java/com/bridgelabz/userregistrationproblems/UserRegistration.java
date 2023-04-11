package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		String mobileNumberRegex = "^[0-9]{2} [0-9]{10}$";
		System.out.println("Enter Email: ");
		Scanner scanner = new Scanner(System.in);
		String mobileNumber = scanner.nextLine();

		Pattern pattern = Pattern.compile(mobileNumberRegex);
		Matcher matcher = pattern.matcher(mobileNumber);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Pattern matches");
		} else {
			System.out.println("Pattern not matches");
		}

	}
}
