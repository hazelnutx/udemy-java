package master_oop;

public class BasicHam {

    private String breadType;
    private boolean meat = true;
    private double price = 20;
    // Additionals that add up to the base price
    private double lettuce = 1.23;
    private double tomato = 1.54;
    private double carrot = 1;
    private double ketchup = 2.25;

    public BasicHam(String breadType, double price, double lettuce, double tomato, double carrot, double ketchup) {
        this.breadType = breadType;
        this.price = price;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.ketchup = ketchup;
    }

    public double getPrice(){
        return price;
    }
    public String getBreadType() {
        return breadType;
    }

    public double getLettuce() {
        return lettuce;
    }

    public double getTomato() {
        return tomato;
    }

    public double getCarrot() {
        return carrot;
    }

    public double getKetchup() {
        return ketchup;
    }
}
