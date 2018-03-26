public class Nice {

	public static void main(String[] args) {
		B b = new B();
	}

	class Booo extends Nice {
		int a = 100;
		int b = 200;

		void m1(int a, int b) {
			System.out.println("The value of the " + (a + b));
			System.out.println("The value of the " + (this.a + this.b));
			// System.out.println("The value of the " + (super.a + super.b));
		}

	}
}
