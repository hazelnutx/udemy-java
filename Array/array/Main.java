package array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Integer[] myArray = getIntegers(3);
		
		printArray(myArray);
		sortIntegers(myArray);
	}
	
	public static Integer[] getIntegers(int numbers) {
		System.out.println("Enter numbers: ");
		Integer[] values = new Integer[numbers];
		
		for(int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static void printArray(Integer[] element) {
		for(int x = 0; x < element.length; x++) {
			System.out.println("Element " + x + " has number " + element[x]);
		}		
	}
	
	public static void sortIntegers(Integer[] inputArray) {
		
		Arrays.sort(inputArray, Collections.reverseOrder());
		String input = Arrays.toString(inputArray);
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println("Element: " + i + " new number is " + input);
		}
		scanner.close();
	}
}
