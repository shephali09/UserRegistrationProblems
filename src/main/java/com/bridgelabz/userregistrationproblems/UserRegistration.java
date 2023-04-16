package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	 String NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
	 String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})*$";
	 String PHONE_PATTERN = "^\\d{2} [1-9]\\d{9}$";
	 String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	
    Predicate<String> validateFirstName = firstName -> Pattern.compile(NAME_PATTERN).matcher(firstName).matches();
    Predicate<String> validateLastName = lastName -> Pattern.compile(NAME_PATTERN).matcher(lastName).matches();
    Predicate<String> validateEmail = email -> Pattern.compile(EMAIL_PATTERN).matcher(email).matches();
    Predicate<String> validatePhoneNumber = phoneNumber -> Pattern.compile(PHONE_PATTERN).matcher(phoneNumber).matches();
    Predicate<String> validatePassword = password -> Pattern.compile(PASSWORD_PATTERN).matcher(password).matches();
}