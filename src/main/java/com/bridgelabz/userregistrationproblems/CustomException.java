package com.bridgelabz.userregistrationproblems;

public class CustomException extends Exception {
	String message;

	public static class InvalidFirstNameException extends RuntimeException {
		public InvalidFirstNameException(String message) {
			super(message);
		}

	}

	public static class InvalidLastNameException extends RuntimeException {
		public InvalidLastNameException(String message) {
			super(message);
		}
	}

	public static class InvalidEmailException extends RuntimeException {
		public InvalidEmailException(String message) {
			super(message);
		}
	}

	public static class InvalidMobileNumberException extends RuntimeException {
		public InvalidMobileNumberException(String message) {
			super(message);
		}
	}

	public static class InvalidPasswordException extends RuntimeException {
		public InvalidPasswordException(String message) {
			super(message);
		}
	}
}
