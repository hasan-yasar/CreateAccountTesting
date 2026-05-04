package com.account;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterValidatorTest {

    RegisterValidator validator;

    @BeforeEach
    void setup() {
        validator = new RegisterValidator();
        System.out.println("Test started");
    }

    @AfterEach
    void teardown() {
        System.out.println("Test finished");
    }

    // FIRST NAME TESTS

    @Test
    void validFirstNameTest() {
        assertTrue(validator.isValidFirstName("Hasan"));
    }

    @Test
    void emptyFirstNameTest() {
        assertFalse(validator.isValidFirstName(""));
    }

    @Test
    void nullFirstNameTest() {
        assertFalse(validator.isValidFirstName(null));
    }

    @Test
    void shortFirstNameTest() {
        assertFalse(validator.isValidFirstName("A"));
    }

    @Test
    void longFirstNameTest() {
        assertFalse(validator.isValidFirstName("abcdefghijklmnopqrstu"));
    }

    @Test
    void firstNameWithNumberTest() {
        assertFalse(validator.isValidFirstName("Hasan123"));
    }

    // LAST NAME TESTS

    @Test
    void validLastNameTest() {
        assertTrue(validator.isValidLastName("Yilmaz"));
    }

    @Test
    void emptyLastNameTest() {
        assertFalse(validator.isValidLastName(""));
    }

    @Test
    void shortLastNameTest() {
        assertFalse(validator.isValidLastName("Y"));
    }

    @Test
    void longLastNameTest() {
        assertFalse(validator.isValidLastName("abcdefghijklmnopqrstu"));
    }

    @Test
    void lastNameWithNumberTest() {
        assertFalse(validator.isValidLastName("Yilmaz1"));
    }

    // EMAIL TESTS

    @Test
    void validEmailTest() {
        assertTrue(validator.isValidEmail("test@gmail.com"));
    }

    @Test
    void invalidEmailWithoutAtTest() {
        assertFalse(validator.isValidEmail("testgmail.com"));
    }

    @Test
    void invalidEmailWithoutDomainTest() {
        assertFalse(validator.isValidEmail("test@"));
    }

    @Test
    void emptyEmailTest() {
        assertFalse(validator.isValidEmail(""));
    }

    @Test
    void nullEmailTest() {
        assertFalse(validator.isValidEmail(null));
    }

    // PASSWORD TESTS

    @Test
    void validPasswordTest() {
        assertTrue(validator.isValidPassword("password123"));
    }

    @Test
    void shortPasswordTest() {
        assertFalse(validator.isValidPassword("123"));
    }

    @Test
    void emptyPasswordTest() {
        assertFalse(validator.isValidPassword(""));
    }

    @Test
    void nullPasswordTest() {
        assertFalse(validator.isValidPassword(null));
    }

    // PASSWORD MATCH TESTS

    @Test
    void matchingPasswordsTest() {
        assertTrue(validator.passwordsMatch("12345678", "12345678"));
    }

    @Test
    void nonMatchingPasswordsTest() {
        assertFalse(validator.passwordsMatch("12345678", "87654321"));
    }

    @Test
    void nullPasswordMatchTest() {
        assertFalse(validator.passwordsMatch(null, "12345678"));
    }

    // DATE OF BIRTH TESTS

    @Test
    void validDateTest() {
        assertTrue(validator.isValidDateOfBirth("01/01/2000"));
    }

    @Test
    void invalidDateFormatTest() {
        assertFalse(validator.isValidDateOfBirth("2000-01-01"));
    }

    @Test
    void emptyDateTest() {
        assertFalse(validator.isValidDateOfBirth(""));
    }

    @Test
    void nullDateTest() {
        assertFalse(validator.isValidDateOfBirth(null));
    }

    @Test
    void invalidDayDateTest() {
        assertFalse(validator.isValidDateOfBirth("99/01/2000"));
    }

    @Test
    void invalidMonthDateTest() {
        assertFalse(validator.isValidDateOfBirth("01/99/2000"));
    }

    @Test
    void invalidYearDateTest() {
        assertFalse(validator.isValidDateOfBirth("01/01/1800"));
    }
}