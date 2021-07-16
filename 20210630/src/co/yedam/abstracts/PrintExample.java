package co.yedam.abstracts;

public class PrintExample {
	public static void main(String[] args) {
		Printer printer = null; // new printer() => 추상클래스는 인스턴스를 못만듬.
		
		printer = new SamsungPrinter("ML6");
		printer.turnOn();
		printer.printing();
		printer.turnOff();

		printer = new CanonPrinter("Epson");
		printer.turnOn();
		printer.printing();
		printer.turnOff();
	}

}