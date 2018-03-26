
class Parent {

	public static void main(String[] args) {
		new Child();
	}
}

class Child extends Parent {

	Child() {
		this(10);
		System.out.println(" 0-arg constructor");
	}

	Child(int a) {
		super();
		System.out.println(" 1-arg constructor");
	}

}
