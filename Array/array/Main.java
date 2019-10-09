package array;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myArray = getIntegers(3);
		
		printArray(myArray);
		sortIntegers(myArray);
	}
	
	public static int[] getIntegers(int numbers) {
		System.out.println("Enter numbers: \r");
		int[] values = new int[numbers];
		
		for(int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static void printArray(int[] element) {
		for(int x = 0; x < element.length; x++) {
			System.out.println("Element " + x + " has number " + element[x]);
		}		
	}
	
	public static void sortIntegers(int[] toSort) {
		System.out.println(Arrays.sort(toSort));
	}
}
