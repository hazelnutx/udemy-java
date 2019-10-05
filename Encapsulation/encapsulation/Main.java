package encapsulation;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer(0, 0, true);
		int fill = 10;
		printer.tonerFill(fill);
		printer.printing(10);
		printer.printing(5);
		printer.printing(30);
//		printer.printing(34);
	}
}
