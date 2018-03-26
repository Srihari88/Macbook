class Sri {

	public static void main(String[] args) {
		Y y = new Y();
		y.m2();

		X x = new X();
		x.m2();
		x.m3();

		W w = new W();
		w.m2();
		w.m3();
		w.m4();

		Hey h = new Hey();
		h.m0();
	}
}

 class Hey {

	void m0() {
		System.out.println("m0 method ");
	}

}

class Y extends Hey {
	void m2() {
		System.out.println("m2 method ");
	}
}

class X extends Y {
	void m3() {
		System.out.println(" m3 method");
	}
}

class W extends X {
	void m4() {
		System.out.println("m4 method");
	}
}