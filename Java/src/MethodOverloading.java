
public class MethodOverloading {

	void m1(int a) {
		System.out.println("Single arugment metod");
	}

	void m1(int a, int b) {
		System.out.println("Multile ple arugement constructior");
		
		int i;
		
		for(i=1;i<=5;i++){
			System.out.println("Inteeger numebrs "+i);
		}
	}

	void m1(char c) {
		System.out.println(" Single argument constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading mol = new MethodOverloading();

		mol.m1('S');
		mol.m1(10);
		mol.m1(23, 45);
	}

}
