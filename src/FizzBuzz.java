
public class FizzBuzz {
	
	public static String convert(int number) {
		if (number % 3 == 0) {
			return "fizz";
		} else if (number % 5 == 0) {
			return "buzz";
		} else {
			return String.valueOf(number);
		}
	}

	public static void main(String[] args) {
	}

}
