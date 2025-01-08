package mcalab4;

abstract class Person{
	String name;int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	abstract void getDetails();
	
	void display() {
		System.out.println("---Details---");
	}
}

interface Gender{
	void displayGender();
}


class Student extends Person implements Gender{
	int rollno;String gen;
	public Student(String name,int age,int rollno,String gen) {
		super(name,age);this.rollno=rollno;this.gen=gen;
	}
	
	void getDetails() {
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		System.out.println("RollNo is : "+rollno);
	}
	
	public void displayGender() {
		System.out.println("Gender : "+gen);
	}
}
public class AbstractClassDemo {
public static void main(String[] args) {
	Student s =new Student("ABC",18,1001,"Male");
	s.display();
	s.getDetails();
	s.displayGender();
	System.out.println("-----------");
	Person p=new Student("CVB",19,1002,"Female");
	p.display();p.getDetails();
	System.out.println("-----------");
	Gender g=new Student("JKL",20,1003,"Male");
	g.displayGender();
}
}
