package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static boolean validateFirstName(String firstName) {
		String regex = "^[A-Z][A-Za-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		if (firstName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public static boolean validateLastName(String lastName) {
		String regex = "^[A-Z][A-Za-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		if (lastName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public static boolean validateEmail(String email) {
		String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";
		Pattern pattern = Pattern.compile(regex);
		if (email == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();

	}
	
	public static boolean validatePhoneNumber(String mobileNumber) {
		String regex = "^[0-9]{2} [0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		if(mobileNumber == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}
	
	public static boolean validatePassword(String password) {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		if(password == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}