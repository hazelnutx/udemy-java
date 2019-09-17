
public class EvenNumber {
	
	public static void main(String[] args) {
		System.out.println(isEvenNumber(3));
	}
	
	
	public static boolean isEvenNumber(int num) {
		
		while((num % 2) == 0) {
			return true;
		}
		return false;
	}
}
