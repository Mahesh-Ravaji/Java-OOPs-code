class GrandParent{
	void edu(){
		System.out.println("Lawyer");
	}
}

class Parent extends GrandParent{
	void property(){
		System.out.println("50 lakhs");
	}
}
class Child extends Parent{
	void play(){
		System.out.println("Plays golf at national level");
	}
}
class Demo1{
	public static void main(String [] args){
		Child c= new Child();
		Parent p = new Parent();
		GrandParent gp= new GrandParent();
		c.edu();c.property();c.play();
	}
}
	 