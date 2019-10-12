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
		int halfLength= array.length / 2;
		
		for(int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}
}
