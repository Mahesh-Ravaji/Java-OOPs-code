import java.io.*;
interface Exam
{
	void percent_cal();
}
class Student
{
	String name;
	int roll, marks1, marks2;
	Student(String s, int r, int m1, int m2)
	{
		name=s;
		roll=r;
		marks1=m1;
		marks2=m2;
	}
}

class Result extends Student implements Exam
{
	Result(String s, int r, int m1, int m2)
	{	
		super(s,r,m1,m2);
	}
	void display()
	{
		System.out.println("Name is "+name);
		System.out.println("Roll is "+roll);
		System.out.println("Marks1 are "+marks1);
		System.out.println("Marks2 are "+marks2);
	}
	public void percent_cal()
	{
		int total=marks1+marks2;
		float per=(total*100)/60;
		System.out.println("% is "+per);
	}
}

class InterfaceDemo
{
	public static void main(String [] args)
	{
		Result abhi=new Result("Abhishek",1,20,25);
		abhi.display();
		abhi.percent_cal();

		Result neha=new Result("Neha",2,25,25);
		neha.display();neha.percent_cal();
	}
}

