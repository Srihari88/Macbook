public class ObjectOrient {

	int a = 200;
	int b = 300;

	 ObjectOrient(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOrient oo = new ObjectOrient(20, 39);
		oo.display();

	}

}
