
class Animal {

	void move() {
		System.out.println(" Animal can move");
	}

}

class Dog extends Animal {
	void move() {
		System.out.println(" Dog can move");
	}

}

class TestDog {
	public static void main(String[] arts) {

		Animal a = new Animal();
		Animal d = new Dog();
		a.move();
		d.move();

	}
}