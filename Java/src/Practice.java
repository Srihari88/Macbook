public class Practice {

	static String tr;
	static char ch;

	int a;
	int b;

	{
		System.out.println("Instance block");
	}

	static {
		System.out.println("Static block");
	}

	Practice(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(" The a value is " + a);
		System.out.println(" The b value is " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice pra = new Practice(200, 300);
		pra.display("Sri", 'B');
		Practice.dispaly1(3000, 4000);
		pra.dispaly1(567, 897);

	}

	void display(String tr, char ch) {
		System.out.println("The values of " + tr);
		System.out.println("The values of " + ch);

	}

	public static void dispaly1(int a, int b) {
		System.out.println("The values of " + a);
		System.out.println("The values of " + b);
	}
}
