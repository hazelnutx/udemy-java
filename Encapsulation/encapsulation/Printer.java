package encapsulation;

public class Printer {
	private int tonerLevel = 100;
	private int printedPages;
	private boolean duplexPrinter;
	
	public Printer(int tonerLevel, int printedPages, boolean duplexPrinter) {
		
		if(tonerLevel >= 0 && tonerLevel <= 100) {			
			this.tonerLevel = tonerLevel;
		}
		if(printedPages > 0 && printedPages <= 35) {
			this.printedPages = printedPages;			
		}
		this.duplexPrinter = duplexPrinter;
	}

	public int tonerFill(int fill) {
		
		this.tonerLevel += fill;			
		if(this.tonerLevel < 0) {
			System.out.println("Change the toner / empty");
		}
		if(this.tonerLevel > 100) {
			System.out.println("Toner is full");
		}
		if(this.tonerLevel >= 0 && this.tonerLevel <= 100) {
			System.out.println("Toner is filled with " + fill + " % " + "and the total is " + tonerLevel + " %");
		}
//		System.out.println("You filled the toner to: " + this.tonerLevel);
		return tonerLevel;
	}
	
	public int printing(int number) {
		this.printedPages += number;
		for(int i = 1; i <= number; i++) {
			if(printedPages > 35) {
				System.out.println("We cannot print over 35 pages");
				break;
			}
			System.out.println("Printing page number " + i + " out of " + number);			
		}
		
		if(printedPages > 0 && printedPages <= 35) {
			System.out.println("Total number of printed pages " + printedPages);			
		}
		return this.printedPages;
	}
		
	public int getTonerLevel() {
		return tonerLevel;
	}
	public int getPrintedPages() {
		return printedPages;
	}
	public boolean isDuplexPrinter() {
		return duplexPrinter;
	}
	
}
