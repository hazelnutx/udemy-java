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
	
	public static void findMin(int[] array) {
		int minim = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < array[i + 1]) {
				minim = array[i];
				if(array[i-1] > minim) {
					System.out.println("Minimum array " + minim);
				}
			}
		}
		scanner.close();
	}

}
