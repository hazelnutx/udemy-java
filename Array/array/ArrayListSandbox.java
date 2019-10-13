package array;

import java.util.ArrayList;

public class ArrayListSandbox {
	
	private static ArrayList<String> groceryList = new ArrayList<String>();
	
	public static void main(String[] args) {
		addList("Milk");
		addList("Bread");
		addList("Olive Oil");
		printList();
		
		removeList("Milk");
		printList();
		
		addList("Milk");
		replaceListByName("Bread", "Water");
		printList();
	
		addList("Peppermint"); // added later - now the size is 4 so when replacing pos. 2, it replaces the 3rd item.
		replaceListWithPosition(2, "Wine"); // size of 3, but it starts from 0, so position 2 is actually the last item.
		printList();
		
		findItem("Wine");
	}
	
	public static void addList(String item) {
		groceryList.add(item);
	}
	
	public static void printList() {
		System.out.println("Grocery size " + groceryList.size() + " in basket");
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1) + "." + groceryList.get(i));
		}
	}
	
	public static void removeList(String item) {
		groceryList.remove(item);
	}
	
	public static void replaceListByName(String item, String replace) {
		for(int i = 0; i < groceryList.size(); i++) {			
			if(groceryList.get(i).equals(item)) { // I iterate through the array and I search or get through each element until something equals to the item that I want to replace
				groceryList.set(i, replace); // I replace that specific element in the array with the new word on the same position (i)
				
			}
		}
	}
	
	public static void replaceListWithPosition(int position, String replace) {
		groceryList.set(position, replace); 
		/*
		 * Does the same thing as above, but instead of replacing the Word with the new one, it replaces
		 * by position, not word (not like : Milk => Water) but 1. Milk => 1. Water
		 * 
		 * This is better used in a long array in which you don't have just one word, but instead you have
		 * id's, which makes your life easier.
		 */
		System.out.println("Replaced item at position " + (position+1) + " with " + replace);
	}
	
	public static String findItem(String item) {
		boolean exists = groceryList.contains(item);
		int pos = groceryList.indexOf(item);
		if(exists) {
			if(pos >= 0) {
				System.out.println(item + " in the position " + (pos+1));
			}
		}
		return null;
	}
}
