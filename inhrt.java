class anim {
	void ate() {
		System.out.println("this anim can eat");
	}
}

class doog extends anim {
	void bark() {
		System.out.println("this anim can bark");
	}
}

class catt extends anim {
	void meow() {
		System.out.println("cat can meow");
	}
}

class pupy extends doog {
	void weep() {
		System.out.println("this anim can weep");
	}
}

public class inhrt {
	public static void main(String[] args) {
		pupy ob1 = new pupy();
		ob1.ate(); // Method from anim class
		ob1.bark(); // Method from doog class
		ob1.weep(); // Method from pupy class
	}
}