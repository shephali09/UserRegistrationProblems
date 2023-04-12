package com.bridgelabz.userregistrationproblems;

import java.lang.annotation.Target;
import org.junit.Test;
import junit.framework.Assert;

public class UserRegistrationTest {

	boolean result;
	UserRegistration userregistration = new UserRegistration();

	@Test
	public void isValidFirstName() {
		result = userregistration.validateFirstName("Shephali");
		Assert.assertEquals(true, result);

	}

	@Test
	public void isValidateFirstName() {
		result = userregistration.validateFirstName("df");
		Assert.assertEquals(true, result);

	}

	@Test
	public void isvalidLastName() {
		result = userregistration.validateLastName("Hiremath");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isvalidateLastName() {
		result = userregistration.validateLastName("sd");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidEmail() {
		result = userregistration.validateEmail("hiremaths34@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidateEmail() {
		result = userregistration.validateEmail("abc..22@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isVAlidMobileNumber() {
		result = userregistration.validatePhoneNumber("91 8329596787");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isVAlidateMobileNumber() {
		result = userregistration.validatePhoneNumber("9 8396787");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidPassword() {
		result = userregistration.validatePassword("A45$vbhn");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidatePassword() {
		result = userregistration.validatePassword("vgg");
		Assert.assertEquals(true, result);
	}
}
