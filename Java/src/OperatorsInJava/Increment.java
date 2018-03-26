package OperatorsInJava;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		char c = 'c';

		a++;
		c++;
		System.out.println(a);
		System.out.println(c);

		System.out.println(a + c);

		// //System.out.println(10 / 0);
		// // System.out.println(10 / 0.0);
		// System.out.println(0 / 0);
		//// System.out.println(0.0 / 0);

		System.out.println(10 < Float.NaN);

		System.out.println(10 <= Float.NaN);
		System.out.println(10 > Float.NaN);
		System.out.println(10 >= Float.NaN);
		System.out.println(10 == Float.NaN);
		System.out.println(Float.NaN == Float.NaN);
		System.out.println(10 != Float.NaN);
		System.out.println(Float.NaN != Float.NaN);

		String t = "Sri";
		int x = 10;
		int y = 20;
		int z = 30;

		System.out.println(t + x + y + z);
		System.out.println(x + y + z + t);
		System.out.println(x + t + z);
		System.out.println(t + x + y + z);

	}

}
