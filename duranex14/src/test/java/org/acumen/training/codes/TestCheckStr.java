package org.acumen.training.codes;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.acumen.training.codes.ItemE.CheckStr;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCheckStr {
	private CheckStr checkStr;
	
	@BeforeEach
	public void setup() {
		checkStr = new CheckStr();
	}
	
	@AfterEach
	public void destroy() {
		checkStr = null;
	}

	@Test
	public void testBinarise() {
		String expected = "00110001";
		String actual = checkStr.binarise(1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertEmptyString() {
		String expected = "01100001";
		String actual = checkStr.convert("a");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertNullString() {
		
		assertDoesNotThrow(() -> {
			String actual = checkStr.convert(null);
		}, "Didn't catch null input");
	}
	
	@Test
	public void testConvertWhiteSpace() {
		String expected = "77";
		String actual = checkStr.convert("\n10001111\n");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertInteger() {
		String input = "1";
		String expected = "00110001";
		
		String actual = checkStr.convert(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTotalEmptyString() {
		int expected = 0;
		
		int actual = checkStr.total("");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTotalNullString() {
		
		assertDoesNotThrow(() -> {
			int actual = checkStr.total(null);
		}, "Didn't catch null input");
	}
	
	@Test
	public void testTotalWhiteSpace() {
		int expected = 32;
		int actual = checkStr.total(" ");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTotalInteger() {
		int expected = Integer.parseInt("49");
		int actual = checkStr.total("1");
		assertEquals(expected, actual);
	}
}
