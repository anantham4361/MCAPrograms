package mcainherit;


	class Person{
		int age;
		String name;
		public Person(int age,String name) {
			this.age=age;
			this.name=name;
		}
		
		public void display() {
			System.out.println("Name is : "+name);
			System.out.println("Age is : "+age);
		}
	}
	
	class Student extends Person{
		int rollno;
		String batch;
		public Student(int age,String name,int rollno,String batch){
			super(age,name);
			this.rollno=rollno;this.batch=batch;
		}
		
		public void display() {
			super.display();
			System.out.println("RollNo is : "+rollno);
			System.out.println("Batch is : "+batch);
		}
	}
	public class MainClass {	
	public static void main(String[]args) {
		Student s=new Student(18,"ABC",210900,"Batch b1");
		s.display();
	}
}
