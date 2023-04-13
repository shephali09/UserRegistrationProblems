package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static boolean validateFirstName(String firstName) throws CustomException.InvalidFirstNameException {
		String regex = "^[A-Z][A-Za-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		if (firstName == null) {
			throw new CustomException.InvalidFirstNameException(
					"First name starts with cap and has minimum 3 characters");

		}
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public static boolean validateLastName(String lastName) throws CustomException.InvalidLastNameException {
		String regex = "^[A-Z][A-Za-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		if (lastName == null) {
			throw new CustomException.InvalidLastNameException(
					"Last name starts with cap and has minimum 3 characters");

		}
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public static boolean validateEmail(String email) throws CustomException.InvalidEmailException {
		String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";
		Pattern pattern = Pattern.compile(regex);
		if (email == null) {
			throw new CustomException.InvalidEmailException(
					"Email has 3 mandatory parts and 2 optional with precise @ and . positions");

		}
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();

	}

	public static boolean validatePhoneNumber(String mobileNumber) throws CustomException.InvalidMobileNumberException {
		String regex = "^[0-9]{2} [0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		if (mobileNumber == null) {
			throw new CustomException.InvalidMobileNumberException(
					"Mobile number contains country code follow by space and 10 digit number");
		}
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}

	public static boolean validatePassword(String password) throws CustomException.InvalidPasswordException {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		if (password == null) {
			throw new CustomException.InvalidPasswordException(
					"Password contains minimum 8 characters, at least 1 upper case and numeric number and has exactly 1 special character");

		}
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}