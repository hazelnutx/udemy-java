package Classes.src;

public class Main {

	public static void main(String[] args) {
		Vehicle veh = new Vehicle();

		veh.plusSpeed(30);
		System.out.println("Speed is: " + veh.getMove());
		
		veh.minusSpeed(15);
		System.out.println("Speed is now: " + veh.getMove());
	}
}
