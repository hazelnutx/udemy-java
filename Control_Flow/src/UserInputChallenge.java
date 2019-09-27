import java.util.Scanner;

public class UserInputChallenge {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		int sum = 0;

		while(true){
			int order = counter + 1;
			System.out.println("Enter number # " + order + " : ");

			boolean isAnInt = scanner.hasNextInt();

			if(isAnInt){
				int number = scanner.nextInt();
				counter++;
				sum += number;
				if(counter == 10){
					break; // stopped the endless loop
				}
			} else {
				System.out.println("INVALID NUMBER");
			}
			scanner.nextLine(); // handle end of line (enter key)
		}
		System.out.println("sum = " + sum);
		scanner.close();
	}

}
