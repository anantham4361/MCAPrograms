package mcalab4;

interface Father{
	void responsibility();
}

interface Mother{
	void kindness();
}

class Child implements Father,Mother{
	String name;
	public Child(String name) {this.name=name;}
	
	public void responsibility() {
		System.out.println(name+" is taking responsibility as his father");
	}
	public void kindness() {
		System.out.println(name+" is as kind as his mother");
	}
}

public class MltpleInterface {
public static void main(String[] args) {
	Child c=new Child("JAYA");
	c.responsibility();
	c.kindness();
}
}
