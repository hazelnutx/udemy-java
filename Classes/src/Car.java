package Classes.src;

public class Car extends Vehicle{
	private int gears;

	public Car(String name, int direction, int move, int gears) {
		super(move, direction, name);
		this.gears = gears;
	}
	
	public int changeGears(int gears) {
		System.out.println("Change gears to: " + gears);
		this.gears = gears;
		return gears;
	}
	
	public int getGears() {
		return gears;
	}
	
	
}
