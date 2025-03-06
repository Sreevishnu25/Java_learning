//class person{
//	public String name;
//	protected int age;
//	private String socail_no;
//	String address;
//	
//	person(String name, int age, String ssn, String address)
//	{
//		this.name = name;
//		this.age = age;
//		this.socail_no = ssn;
//		this.address = address;
//	}
//	
//}
//
//
//class employee extends person{
//	
//	employee(String name, int age, String ssn, String address )
//	{
//		super(name,age,ssn,address);
//		
//	}
//	
//	
//}
//
//
//public class q6 {
//
//	public static void main(String[] args) {
//		employee p1 = new employee("John",23,"ztg45g","chennai");
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.address);
//		   
//		
//		
//	}
//
//}






//class counter{
//
//	static int count = 0;
//	int instanceNumber = 0;
//	
//	 counter(){	
//		count=  count +1;
//		instanceNumber = +1;
//}
//	 void disp(){
//		 System.out.println(instanceNumber);
//		 System.out.println(count);
//	 }
//	
//
//}
//
//
//
//
//
//
//
//public class q6 {
////
//	public static void main(String[] args) {
//	
//	counter c1 = new counter();
//	c1.disp();
//	counter c2 = new counter();
//	c2.disp();
//	counter c3 = new counter();
//	c3.disp();
//	
//	}
//}




abstract class vehicle{
	
	final void startengine()
	{
		System.out.print("engine started....");
	}
	
	static String getVehicle()
	{
		return "generic vehicle";
	}
	
	abstract void drive();
	
	
}


class car extends vehicle{
	
	@Override
	void drive(){
		System.out.println("drive a car");
		
		
	}
	
}

class bike extends vehicle{
	
	@Override
	void drive() {
		System.out.print("drive a bike");
		
	}
}


public class q6 {

	public static void main(String[] args) {
		
		car c1 = new car();
		c1.drive();
		System.out.println(vehicle.getVehicle());
		bike b1 = new bike();
		b1.drive();
	
		
	}
}
