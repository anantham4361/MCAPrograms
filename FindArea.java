package firstpkg;
import java.util.*;


class SquareArea{
	Scanner sc=new Scanner(System.in);
	private int side;
	
private void takeInput() {
	System.out.println("-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=--");
	System.out.print("Enter side of sqare : ");
	side=sc.nextInt();
}
private int calculate() {
	takeInput();
	return side*side;
}

protected void display() {
	int r=calculate();
	System.out.println("Area of sqaure is : "+r);
}

}

class CircleArea{
	Scanner sc=new Scanner(System.in);
	private int r;
	
private void takeInput() {
	System.out.println("-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=--");
	System.out.print("Enter radius of circle : ");
	r=sc.nextInt();
}
private double calculate() {
	takeInput();
	return 3.14*r*r;
}

protected void display() {
	double res=calculate();
	System.out.println("Area of circle is : "+res);
}	
}

class RectArea{
	Scanner sc=new Scanner(System.in);
	private int l,b;
	
private void takeInput() {
	System.out.println("-----------------------------------");
	System.out.print("Enter length of Rectangle : ");
	l=sc.nextInt();
	System.out.print("Enter breadth of Rectangle : ");
	b=sc.nextInt();
}
private int calculate() {
	takeInput();
	return l*b;
}

protected void display() {
	int r=calculate();
	System.out.println("Area of Rectangle is : "+r);
}
}


public class FindArea {
public static void main(String [] args) {
	SquareArea s=new SquareArea();
	s.display();
	CircleArea c=new CircleArea();
	c.display();
	RectArea r=new RectArea();
	r.display();
	
}	
}
