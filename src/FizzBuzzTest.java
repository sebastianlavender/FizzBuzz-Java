import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class FizzBuzzTest extends FizzBuzz {

	@Test
	void numberTest() {
		String result = FizzBuzz.convert(1);
		assertEquals("1", result);
	}
	
	@Test
	void fizzTest() {
		assertEquals("fizz", FizzBuzz.convert(3));
		assertEquals("fizz", FizzBuzz.convert(9));
	}
	
	@Test
	void buzzTest() {
		assertEquals("buzz", FizzBuzz.convert(5));
		assertEquals("buzz", FizzBuzz.convert(10));
	}
	

}
