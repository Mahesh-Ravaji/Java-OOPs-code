interface OS
{
	void spec();
}

class Android implements OS
{
	public void spec()
	{
		System.out.println("Most powerful OS");
	}
}

class iOS implements OS
{
	public void spec()
	{
		System.out.println("Most secure OS");
	}
}

class Lumia implements OS
{
	public void spec()
	{
		System.out.println("Least used OS, about to die");
	}
}

class OperatingSystemFactory
{
	public OS getInstance (String str)
	{
		if (str.equals("Open"))
			return new Android();
		else if (str.equals("Closed"))
			return new iOS();
		else
		return new Lumia();

	}
}

class FactoryMain
{
	public static void main (String [] args)
	{
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj= osf.getInstance("Open");
		obj.spec();
	}
}