package Classes.src;

import java.util.Scanner;

public class Vehicle {
	private int steeringWheel;
	private int move;

	Scanner scanner = new Scanner(System.in);

	public Vehicle() {
		this(1, 0);
	}

	public Vehicle(int steeringWheel, int move) {
		this.steeringWheel = steeringWheel;
		this.move = move;
	}

	int sum = 0;

	public int plusSpeed(int speed) {
		this.move += speed;
		System.out.println("Increase speed by: " + getMove());
		return move;
		
	}
	public int minusSpeed(int speed) {
		this.move -= speed;
		System.out.println("Decrease speed by: " + getMove());
		return move;
	}

	public int getSteeringWheel() {
		return steeringWheel;
	}

	public int getMove() {
		return move;
	}
}
