

interface Subject
{
	void getDetails();
}

class DataStructure implements Subject
{
	public void getDetails()
	{
		System.out.println ("this is the most difficult sub");
	}
}

class OOP implements Subject
{
	public void getDetails()
	{
		System.out.println ("this is the most easiest sub");
	}
}


class DS implements Subject
{
	public void getDetails()
	{
		System.out.println ("Good for concepts");
	}
}

class SubjectFactory
{
	public Subject chooseCourse(String str)
	{
		if(str.equals("Challenging"))
			return new DS();
		
		else if(str.equals("Powerful"))
			return new OOP();
				
		else
		return new DataStructure();
		
	}
}


class SubjectMain
{
	public static void main (String [] args)
	{
		SubjectFactory sf= new SubjectFactory();
		Subject sub=sf.chooseCourse("Powerful");
		sub.getDetails();
	}
}

/*class SubjectMain
{
	public static void main (String [] args)
	{
		Subject sf= new OOP();
		System.out.println(sf.getDetails()); 
	}
}*/