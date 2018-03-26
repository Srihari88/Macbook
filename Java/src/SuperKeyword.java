
class SuperKeyword {

	public void set() {
		System.out.println("Set the all values");
	}
}

class NameSet extends SuperKeyword {

	public void set() {
		super.set();
		System.out.println(" Set child class");
	}

}

class TestSuper {

	public static void main(String[] args) {

		SuperKeyword ts = new SuperKeyword();
		ts.set();
	}
}