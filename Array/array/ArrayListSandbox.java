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
		replaceList("Bread", "Water");
		printList();
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
	
	public static void replaceList(String item, String replace) {
		for(int i = 0; i < groceryList.size(); i++) {			
			if(groceryList.get(i).equals(item)) { // I iterate through the array and I search or get through each element until something equals to the item that I want to replace
				groceryList.set(i, replace); // I replace that specific element in the array with the new word on the same position (i)
				
			}
		}
	}
}
