interface It1 {

	void m1();

	void m2();

	void m3();
}

class Intermediate implements It1 {

	public void m1() {
		System.out.println(" m1 method");
	}

	public void m2() {
		System.out.println(" m2 method");
	}

	public void m3() {
		System.out.println(" m3 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intermediate i = new Intermediate();
		i.m1();
		i.m2();
		i.m3();

	}

}