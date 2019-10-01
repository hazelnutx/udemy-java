package Classes.src;

public class Opel extends Car{
	
	private double weight;

	public Opel(double weight) {
		super("Opel" ,0, 0, 1);
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double changeWeight(double weight) {
		System.out.println("New weight is: " + weight);
		this.weight = weight;
		return weight;
	}
}
