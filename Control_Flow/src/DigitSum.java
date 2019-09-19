
public class DigitSum {
	public static void main(String[] args) {
		
		
		System.out.println(sumDigit(125));
	}
	
	public static int sumDigit(int number) {
		if(number < 10) {
			return -1;
		}
		
		int sum = 0;
		while (number >  10) {
			//extract the least significant digit
			int digit = number % 10;
			sum += digit;
			
			//discard the least significant digit
			number /= 10;
		}
		
		return sum;
		
	}
}

// 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5.
// sumDigit(125) = 1 + 2 + 5 = 8. 8 is the return number.