package Classes.src;


public class Vehicle {
	private int direction;
	private int move;
	private String name;

	public Vehicle() {
		this(0, 0, "Defualt");
	}
	
	public Vehicle(int direction, int move, String name) {
		this.direction = direction;
		this.move = move;
		this.name = name;
	}

	int sum = 0;

	public void plusSpeed(int speed) {
		this.move += speed;
		System.out.println("Increase speed by: " + getMove());
	}
	public void minusSpeed(int speed) {
		this.move -= speed;
		System.out.println("Decrease speed by: " + speed);
	}
	
	public void direction(int direction) {
		this.direction = direction;
		System.out.println("Direction is: " + direction + " degrees");
	}

	public int getDirection() {
		return direction;
	}

	public int getMove() {
		return move;
	}
	public String getName() {
		return name;
	}
}
