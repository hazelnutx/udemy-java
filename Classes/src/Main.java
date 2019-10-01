package Classes.src;

public class Main {

	public static void main(String[] args) {
		Vehicle veh = new Vehicle();

		Opel opel = new Opel(1000);
		
		opel.direction(34);
		opel.plusSpeed(23);
		System.out.println("Now speed is: " + opel.getMove());
		opel.minusSpeed(20);
		System.out.println("Now speed is: " + opel.getMove());
		
		System.out.println(opel.changeWeight(300));
	}
}
