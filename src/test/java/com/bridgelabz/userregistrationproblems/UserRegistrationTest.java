package com.bridgelabz.userregistrationproblems;

import java.lang.annotation.Target;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	boolean result;
	UserRegistration userregistration = new UserRegistration();

	@Test
	public void isValidFirstNameForPassedTestCase() {
		result = userregistration.validateFirstName("Shephali");
		Assert.assertEquals(true, result);

	}

	@Test
	public void isValidFirstNameForFailedTestCase() {
		result = userregistration.validateFirstName("df");
		Assert.assertEquals(true, result);

	}

	@Test
	public void isvalidLastNameForPassedTestCase() {
		result = userregistration.validateLastName("Hiremath");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isvalidLastNameForFailedTestCase() {
		result = userregistration.validateLastName("sd");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidEmailForPassesTestCase() {
		result = userregistration.validateEmail("hiremaths34@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidEmailForFailedTestCase() {
		result = userregistration.validateEmail("abc..22@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isVAlidMobileNumberForPassedTestCase() {
		result = userregistration.validatePhoneNumber("91 8329596787");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isVAlidMobileNumberForFailedTestCase() {
		result = userregistration.validatePhoneNumber("9 8396787");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidPasswordForPassedTestCase() {
		result = userregistration.validatePassword("A45$vbhn");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidPasswordForFailedTestCase() {
		result = userregistration.validatePassword("vgg");
		Assert.assertEquals(true, result);
	}

}
