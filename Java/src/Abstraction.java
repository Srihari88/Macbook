
abstract class JavaPractice {

	abstract void m1();

	abstract void m2();

	abstract void m3();

	void m4() {
		System.out.println("M4 method");
	}
}

class JavaPractice1 extends JavaPractice {

	void m1() {
		System.out.println("M1 method");
	}

	void m2() {
		System.out.println("M2 method");
	}

	void m3() {
		System.out.println("M3 method");
	}

	public static void main(String[] args) {
		JavaPractice1 jp = new JavaPractice1();
		jp.m1();
		jp.m2();
		jp.m3();
		jp.m4();

	}

}
