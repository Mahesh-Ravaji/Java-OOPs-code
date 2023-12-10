class Sachin
{
	void play()
	{
		System.out.println("Batsman");
	}
}

class Arjun extends Sachin{
	void play()//overriding
	{
		System.out.println("Bowler");
	}
	void play(String s)//overloading
	{
		System.out.println("Plays "+s);
	}
}

class Overriding {
	public static void main(String [] args)
	{
		Sachin s = new Sachin();
		s.play();
		Arjun c= new Arjun();
		c.play();c.play("Tennis");
	}
}