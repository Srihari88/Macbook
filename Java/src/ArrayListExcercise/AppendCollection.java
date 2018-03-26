package ArrayListExcercise;

import java.util.ArrayList;

public class AppendCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("CHIRU");
		al.add("PAWANKALYAN");
		al.add("ALLU ARJUN");
		al.add("RAM CHARAN");
		al.add(" VARUN TEJ");

		System.out.println(al);

		ArrayList al2 = new ArrayList();

		al2.add(10);
		al2.add(30);

		al2.addAll(al);

		System.out.println(al2);
	}

}
