
public class InterestRateChallenge {
	public static void main(String[] args) {
		
		for(int i = 2; i <= 8; i++) {
			System.out.println("Amount 10.000 and interest " + i + " = " + String.format("%.2f", calculateInterest(10000.0, i)));
		}
		
		for(int i = 8; i >= 2; i--) {
			System.out.println("Amout 10.000 and interest " + i + "% desending = " + String.format("%.2f", calculateInterest(10000.0, i)));
		}
		
		System.out.println("*********************************");
		//System.out.println(isPrime(2));
		
		int count = 0;
		for(int x = 10; x < 50; x++) {
			if(isPrime(x)) {
				count++;
				System.out.println("Number " + x + " is a prime number");
				if(count == 6) {
					System.out.println("Exiting the loop");
					break;
				}
			}
			
		}
	}
	
	public static boolean isPrime(int n) {
		
		if(n == 1) {
			return false;
		}
		
		for(int i = 2; i <= (long) Math.sqrt(n); i++) { //sqrt is faster than diving n/2, it's looping 4 times faster.
//			System.out.println("Looping" + i); // to see how many times it loops.
			if(n % i == 0) {
				return false;
			}
		}
		return true;
		
		/**
		 * n = 2 
		 * in for loop is goes like this i = 2, if i <= 2/2, increment  => i =2 and n = 2 i<=n/2 == 2 <= 1 false.
		 * 		if statement - the remainder between n and i if it's equal to 0 == false : 2 % 1 = 1 so it's not false.
		 * otherwise true
		 */
	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
}
