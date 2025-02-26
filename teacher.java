public class teacher {
		
	String myname;
	
	teacher(){
		
		System.out.println("hello");
	}
	
	
	void setname(String myname) {
		this.myname = myname;
	}
	
	public static void main(String[] args) {
		teacher ob1 = new teacher();
		ob1.setname("mark");
		System.out.println(ob1.myname);
		
		
	}

}
