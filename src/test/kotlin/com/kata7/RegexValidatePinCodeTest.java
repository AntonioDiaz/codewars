package com.kata7;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexValidatePinCodeTest {

    @Test
    public void testRegex() {
        String aDigit = "\\d";
        assertTrue("2".matches(aDigit));
        assertFalse("a".matches(aDigit));
        String twoDigits = "\\d{2}";
        assertTrue("12".matches(twoDigits));
        assertFalse("122".matches(twoDigits));
        assertFalse("1a".matches(twoDigits));
        String fourDigitsOrSix = "\\d{4}|\\d{6}";
        assertTrue("1234".matches(fourDigitsOrSix));
        assertTrue("123456".matches(fourDigitsOrSix));
        assertFalse("12345".matches(fourDigitsOrSix));


    }


    @Test
    public void validPins() {
        assertEquals(true, RegexValidatePinCode.validatePin("1234"));
        assertEquals(true, RegexValidatePinCode.validatePin("0000"));
        assertEquals(true, RegexValidatePinCode.validatePin("1111"));
        assertEquals(true, RegexValidatePinCode.validatePin("123456"));
        assertEquals(true, RegexValidatePinCode.validatePin("098765"));
        assertEquals(true, RegexValidatePinCode.validatePin("000000"));
        assertEquals(true, RegexValidatePinCode.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, RegexValidatePinCode.validatePin("a234"));
        assertEquals(false, RegexValidatePinCode.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, RegexValidatePinCode.validatePin("1"));
        assertEquals(false, RegexValidatePinCode.validatePin("12"));
        assertEquals(false, RegexValidatePinCode.validatePin("123"));
        assertEquals(false, RegexValidatePinCode.validatePin("12345"));
        assertEquals(false, RegexValidatePinCode.validatePin("1234567"));
        assertEquals(false, RegexValidatePinCode.validatePin("-1234"));
        assertEquals(false, RegexValidatePinCode.validatePin("1.234"));
        assertEquals(false, RegexValidatePinCode.validatePin("00000000"));
    }
}