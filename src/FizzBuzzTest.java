import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class FizzBuzzTest extends FizzBuzz {

	@Test
	void test() {
		int result = FizzBuzz.convert(1);
		assertEquals(1, result);
	}

}
