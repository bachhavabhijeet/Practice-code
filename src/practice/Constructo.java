package practice;
public class Constructo {
	String a;
	int b;
	// use of constructor to initialize variables
	// user defined without parameter
	public Constructo() {
		a = "India";
		b = 90;
	}
	// use of constructor to initialize variables
	// user defined with parameter
	public Constructo(String x, int y)// MH 22
	{
		a = x;// MH
		b = y;// 22
	}
	public Constructo(int m, String n) {
		b = m;
		a = n;
	}
	public static void main(String[] args) {
		Constructo c3 = new Constructo();// created object using without parameter
		c3.display();
		Constructo c4 = new Constructo();// created object using without parameter
		c4.display();
		Constructo c5 = new Constructo("MH", 22);
		c5.display();
		Constructo c6 = new Constructo(11, "Katraj");
		c6.display();
	}
	public void display() {
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);
	}
}
