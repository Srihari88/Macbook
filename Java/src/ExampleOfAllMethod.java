/* Example-1// Methods with no parameters
public class VariablePractice {

	void m1() {
		System.out.println(" This is my m1 method");
	}

	static void m2() {
		System.out.println(" This is my m2 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariablePractice vp = new VariablePractice();
		vp.m1();
		VariablePractice.m2();

	}

}


// Example-2// Method expecting parameters
public class VariablePractice {

	void m1(int a, int b) {
		System.out.println(" This is my m1 method");
		System.out.println(a);
		System.out.println(b);

	}

	static void m2(String str, char ch) {
		System.out.println(" This is my m2 method");
		System.out.println(str);
		System.out.println(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariablePractice vp = new VariablePractice();
		vp.m1(34, 44);
		VariablePractice.m2("Srihari", 'G');

	}

}

// Method with expecteding objects
 // Example-2: Passing 

class X {
}

class Emp {
}

class Y {
}

class Car {
}

public class VariablePractice {

	void m1(X x, Emp e) {
		System.out.println(" This is my m1 method");

	}

	static void m2(Y y, Car s) {
		System.out.println(" This is my m2 method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariablePractice vp = new VariablePractice();

		X x = new X();
		Emp e = new Emp();
		vp.m1(x, e);
		// vp.m1(new X(), new Emp())

		Y y = new Y();
		Car c = new Car();
		VariablePractice.m2(y, c);

		// VariablePractice.m2(new Y(), new Car());

	}

}



//Example: 5. Same method name doesn't allow in the same class with same signature. But it allows the same class with different signature 
 // Example-2: Passing 


public class VariablePractice {

	void m1() {
		System.out.println(" This is my m1 method");

	}

	static void m1() {
		System.out.println(" This is my m2 method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariablePractice vp = new VariablePractice();


		// VariablePractice.m2(new Y(), new Car());

	}

}




// Example-2: Passing 


public class VariablePractice {

	void m1() {
		System.out.println(" This is my m1 method");

	}

	static void m1(int a) {
		System.out.println(" This is my m2 method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariablePractice vp = new VariablePractice();


		// VariablePractice.m2(new Y(), new Car());

	}

}
example -6: Inner methods not allowed in java


Example-7: Method calling.


public class VariablePractice {

	void m1() {
		m2();
		System.out.println(" This is my m1 method");

	}

	void m2() {
		m3(10);
		System.out.println(" This is my m2 method");

	}

	void m3(int a) {
		System.out.println(" This is my m3 method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariablePractice vp = new VariablePractice();
		vp.m1();

	}

}





*/
