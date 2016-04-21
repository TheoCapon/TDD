package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1 () {
	
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();

		String actual = romanNumeral.convertToRoman(input);

		Assert.assertEquals(expected, actual);
	}
	@Test
	public void convertToRoman(){	
		RomanNumerals romanNumeral = new RomanNumerals();	
		Assert.assertEquals("I", romanNumeral.convertToRoman("1"));
		Assert.assertEquals("III", romanNumeral.convertToRoman("3"));
	
		
		
	}
}