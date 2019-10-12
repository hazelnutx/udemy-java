package array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {8, 1, 4, 12, 15, 21};
		System.out.println("Array " + Arrays.toString(arr));
		
		reverse(arr);
		System.out.println("Reverse: " + Arrays.toString(arr));
	}
	
	public static void reverse(int[] array) {
		int maxIndex = array.length - 1;
/*
 * Always put -1 if you want to check the last number or the last space in an array because it start from 0
 * so 0 1 2 3 4 you have a length of 5, but if you want to access the last element you need to go something
 * like this 5 - 1 = 4 === last element.
 * 
 * The halfLength is divided by 2, because you want to get to the middle of the array, and kinda flip on it.
 * 
 */
		int halfLength= array.length / 2;
		
		for(int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}
}
