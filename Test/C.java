class A
{
	void show()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Class B Modified");
	}
}
class C
{
	public static void main(String args[])
	{
		A obj = new B();
		obj.show();
		obj.display();
	}
}