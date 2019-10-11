package array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myArray = getIntegers(3);
		int[] sorted = sortIntegers(myArray);
		printArray(sorted); // you can change from myArray to sorted
	}
	
	public static int[] getIntegers(int numbers) {
		System.out.println("Enter numbers: ");
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
	
	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}
		
		boolean flag = true; // put this when you want to check if something is true go on and if not, put it to false so it stops
		int temp;
		
		while(flag) {
			flag = false;
			for(int i = 0; i < sortedArray.length - 1; i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		scanner.close();
		return sortedArray;		
	}
}
