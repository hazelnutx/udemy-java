package polymorphism;

public class Main {
	
	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {
			Car car = randomCar();
			System.out.println("Car #" + i + ":" + car.getName() + "\n" + "Engine: " + car.startEngine() + "\n");
		}
	}
	
	
	public static Car randomCar() {
		int randomNumber = (int) (Math.random() * 3) + 1;
		System.out.println("Random number " + randomNumber);
		
		switch(randomNumber) {
			case 1:
				return new Nissan();
				
			case 2:
				return new Zafira();
			
			case 3:
				return new Bmw();

		}
		return null;
	}
}
