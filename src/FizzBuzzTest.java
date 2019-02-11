import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest extends FizzBuzz {
	
	public static FizzBuzz fizzbuzz;
	
	@BeforeAll
    public static void oneTimeSetUp() {
		fizzbuzz = new FizzBuzz();
    }

	@Test
	void numberTest() {
		assertEquals("1", fizzbuzz.convert(1));
	}
	
	@Test
	void fizzTest() {
		assertEquals("fizz", fizzbuzz.convert(3));
		assertEquals("fizz", fizzbuzz.convert(9));
	}
	
	@Test
	void buzzTest() {
		assertEquals("buzz", fizzbuzz.convert(5));
		assertEquals("buzz", fizzbuzz.convert(10));
	}
	
	@Test
	void fizzBuzzTest() {
		assertEquals("fizzbuzz", fizzbuzz.convert(15));
		assertEquals("fizzbuzz", fizzbuzz.convert(30));
	}
	

}
