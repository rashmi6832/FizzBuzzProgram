package test.com.bnpp.kata;
import org.junit.Assert;
import org.junit.Test;

import com.bnpp.kata.FizzBuzz;


public class FizzBuzzTest {
	
	@Test
	public void testParseNumber() {
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		Assert.assertEquals("0",fizzBuzz.parseNumber(0));
		Assert.assertEquals("Fizz",fizzBuzz.parseNumber(3));
		Assert.assertEquals("Buzz",fizzBuzz.parseNumber(5));
		Assert.assertEquals("FizzBuzz",fizzBuzz.parseNumber(15));
	}

}
