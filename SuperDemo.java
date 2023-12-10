class Parent{
	int age=35;
	String name="Alok";
	
	void getName()
	{
	 	System.out.println("Parent name is "+name);
		System.out.println("Parent age is "+age);
	}
}

class Child extends Parent
{
	int age=5;
	String name="Parag";
	void getName()
	{
		super.getName();
		System.out.println("Child name is "+name);
		System.out.println("Child age is "+age);
		
	}

}

class SuperDemo
{
	public static void main(String [] args)
	{
		Child c= new Child();
		c.getName();
	}
}