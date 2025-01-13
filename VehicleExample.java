package mcalab4;

interface Vehicle{
	void tyre();
}

class Car implements Vehicle{
	public void tyre() {
		System.out.println("Car is a vehicle with 4 tyre");
	}
}

class MotorBike implements Vehicle{
	public void tyre() {
		System.out.println("MotorBike is a vehicle with 2 tyre");
	}
}
public class VehicleExample {
public static void main(String[] args) {
	Car c=new Car();c.tyre();
	MotorBike m=new MotorBike();m.tyre();
	
}
}
