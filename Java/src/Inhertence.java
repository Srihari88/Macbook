
public class Inhertence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.m1();
		a.m2();
		B b = new B();
		b.m3();
		b.m4();

		C c = new C();
		c.m5();

	}

}

class A {

	public void m1() {
		System.out.println("m1 method");

	}

	public void m2() {
		System.out.println("m2 method");
	}
}

class B extends A {

	public void m3() {
		System.out.println("m3 method");

	}

	public void m4() {
		System.out.println("m4 method");

	}
}

class C extends B {
	public void m5() {
		System.out.println("m5 method");

	}

}
