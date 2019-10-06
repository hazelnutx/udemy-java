package polymorphism;

class Car {
	private boolean engine;
	private int cylinders;
	private int wheels;
	private String name;

	
	public Car(int cylinders, String name) {
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.name = name;
	}
	
	public String startEngine() {		
		return "Car -> Engine starting";
	}
	
	public String accelerate() {
		return "Car -> Accelerate";
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
		
}

class Nissan extends Car {
	
	public Nissan() {
		super(8, "Nissan 350z");
	}
	
	@Override
	public String startEngine() {
		return "350z V8 Engine Starting!";
	}

	@Override
	public String accelerate() {
		return "Nissan -> Accelerate";
	}
	
}

class Zafira extends Car {
	public Zafira() {
		super(4, "Opel Zafira");
	}
	
	@Override 
	public String startEngine() {
		return "Zafira -> Start Engine";
	}
	
	@Override
	public String accelerate() {
		return "Opel -> Accelerates";
	}
}

class Bmw extends Car {
	public Bmw() {
		super(6, "BMW M6");
	}
	
	@Override
	public String startEngine() {
		return "BMW -> Start Engine";
	}
	
	@Override
	public String accelerate() {
		return "BMW -> Accelerates";
	}
}

