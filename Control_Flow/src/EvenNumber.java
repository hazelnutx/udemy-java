
public class EvenNumber {
	
	public static void main(String[] args) {
		
		int number = 4;
		int finishNumber = 20;
		
		while(number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) { //So it won't print out the false values
				continue; // won't let it go pass this if there is not an even number e.g : 7 and it will just go back to top and continue with the new number.
			}
			System.out.println("The even number is " + number);
		}
	}
	
	
	public static boolean isEvenNumber(int num) {
		
		while((num % 2) == 0) {
			return true;
		}
		
		return false;
	}
}
