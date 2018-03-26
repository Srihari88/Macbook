
public class ConstruorChain {

	ConstruorChain() {
		this(56);

		System.out.println("I am default constrcuor");
	}

	public ConstruorChain(int a) {

		System.out.println("I am single parameter constrcuor");
	}

	public ConstruorChain(int a, int b) {
		this();
		System.out.println("I am double parameter constrcuor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstruorChain ch = new ConstruorChain(10, 50);

	}

}
