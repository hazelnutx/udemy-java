package Classes.src;

import java.util.Scanner;

public class Vehicle {
	private int steeringWheel;
	private int move;

	Scanner scanner = new Scanner(System.in);

	public Vehicle() {
		this(1, 0);
		speedOfCar();
	}

	public Vehicle(int steeringWheel, int move) {
		this.steeringWheel = steeringWheel;
		this.move = move;
	}

	int count = 0;
	int sum = 0;

	public int speedOfCar() {
		String input = scanner.next();
		if (input.equals("yes")) {
			this.move += 10;
			System.out.println("Increased speed to: " + getMove());
			count++;
		} else if (input.equals("no")) {
			this.move -= 10;
			System.out.println("Decreased speed to: " + getMove());
			count++;
		} else
			return -1;
		scanner.close();
		return this.move;
	}

	public int getSteeringWheel() {
		return steeringWheel;
	}

	public int getMove() {
		return move;
	}
}
