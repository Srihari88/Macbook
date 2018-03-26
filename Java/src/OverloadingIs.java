
public class OverloadingIs {

	void m1(int num, char c) {
		System.out.println("Single argument constructor");

	}

	void m1(char c, int num) {

		System.out.println("Double argument constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingIs ols = new OverloadingIs();
		ols.m1(10, 'S');
		ols.m1('P', 77);

	}

}
