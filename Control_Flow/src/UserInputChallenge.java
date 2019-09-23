import java.util.Scanner;

public class UserInputChallenge {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number #x: ");
		
		boolean hasInt = scanner.hasNextInt();
		int count = 0;
		
		if(hasInt) {
			int numbers = scanner.nextInt();
			scanner.nextLine();
			
			
		
			System.out.println("Sum of the numbers are: " + count);
			
		} else {
			System.out.println("Invalid number");
		}
		
		scanner.close();
		
	}
	
}
