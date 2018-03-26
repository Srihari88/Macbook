public class StaticBlocks {

	static {
		System.out.println("Hello All");
	}

	StaticBlocks() {
		System.out.println("0- ORG constratuctor ");
	}

	
	StaticBlocks(int a) {
		System.out.println("1- ORG constratuctor ");
	}

	{
		System.out.println("Instance block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticBlocks sb = new StaticBlocks();
		StaticBlocks sb1 = new StaticBlocks(10);

	}

}
