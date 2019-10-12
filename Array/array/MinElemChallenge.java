package array;
import java.util.Scanner;

public class MinElemChallenge {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		findMin(readIntegers(5));
	}
	
	public static int[] readIntegers(int count) {
		System.out.println("Enter numbers:");
		int[] values = new int[count];
		
		for(int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			int value = array[i];
		
			if(value < min) {
				min = value;
			}
		}
		System.out.println("Minimum value " + min);
		return min;
	}

}
