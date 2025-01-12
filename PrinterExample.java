package mcalab4;

abstract class Printer{
	String name;
	public Printer(String name) {
		this.name=name;
	}
	
	abstract void display();
	
	void displayLine() {
		System.out.println("=========================");
	}
}

class Laserjet extends Printer{
	int modelno;
	public Laserjet(String name,int modelno) {
		super(name);
		this.modelno=modelno;
	}
	
	void display() {
		System.out.println("Printer type : "+name);
		System.out.println("Model : "+modelno);
		System.out.println("This is example for non-impact printer");
	}
}

class Dotmatrix extends Printer{
	int modelno;
	public Dotmatrix(String name,int modelno) {
		super(name);
		this.modelno=modelno;
	}
	
	void display() {
		System.out.println("Printer type : "+name);
		System.out.println("Model : "+modelno);
		System.out.println("This is example for impact printer");
	}
}
public class PrinterExample {
public static void main(String[] args) {
	Printer L = new Laserjet("Laserjet",1998);
	L.displayLine();
	L.display();
	Printer D = new Dotmatrix("Dotmatrix",1998);
	D.displayLine();
	D.display();
	
}
}
