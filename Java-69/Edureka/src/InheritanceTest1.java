class A{
	int a=10,b=20;
	void displayAB() {
		System.out.println("Inside class A:: "+ a+" | "+b);
	}
}

class B extends A{
	int c=30;
	void displayC() {
		System.out.println("Inside class B:: "+a+" | "+b+" | "+c);
	}
}

public class InheritanceTest1 
{
	public static void main(String[] args) 
	{
	 B obj = new B();
	 System.out.println(obj.a+" | "+obj.b+" | "+obj.c);
	 obj.displayAB();
	 obj.displayC();
	}
}
