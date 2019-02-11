
public class FizzBuzz {
	
	public String convert(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "fizzbuzz";
		} else if (number % 5 == 0) {
			return "buzz";
		} else if (number % 3 == 0) {
			return "fizz";
		} else {
			return String.valueOf(number);
		}
	}

	public static void main(String[] args) {
		FizzBuzz fizzbuzz = new FizzBuzz();
		for (int i = 1; i <= 100; i++) {
			System.out.println(fizzbuzz.convert(i));
		}
	}

}
