package com.bridgelabz.userregistrationproblems;

import java.lang.annotation.Target;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	boolean result;
	UserRegistration userregistration = new UserRegistration();

	@Test
	public void isValidFirstNameForPassedTestCase() {
		result = userregistration.validateFirstName.test("Shephali");
		Assert.assertEquals(true, result);

	}

	@Test
	public void isValidFirstNameForFailedTestCase() {
		result = userregistration.validateFirstName.test("df");
		Assert.assertEquals(true, result);

	}

	@Test
	public void isvalidLastNameForPassedTestCase() {
		result = userregistration.validateLastName.test("Hiremath");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isvalidLastNameForFailedTestCase() {
		result = userregistration.validateLastName.test("sd");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidEmailForPassesTestCase() {
		result = userregistration.validateEmail.test("hiremaths34@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidEmailForFailedTestCase() {
		result = userregistration.validateEmail.test("abc..22@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isVAlidMobileNumberForPassedTestCase() {
		result = userregistration.validatePhoneNumber.test("91 8329596787");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isVAlidMobileNumberForFailedTestCase() {
		result = userregistration.validatePhoneNumber.test("9 8396787");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidPasswordForPassedTestCase() {
		result = userregistration.validatePassword.test("A45$vbhn");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidPasswordForFailedTestCase() {
		result = userregistration.validatePassword.test("vgg");
		Assert.assertEquals(true, result);
	}

}
