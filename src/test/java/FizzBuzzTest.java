import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class FizzBuzzTest {
	
	@Test
	public void testParseNumber() {
		
		FizzBuzz fizzBuzz = new FizzBuzz();

		Assert.assertEquals(0,fizzBuzz.parseNumber(0));
	}

}
