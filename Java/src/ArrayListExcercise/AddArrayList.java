package ArrayListExcercise;

import java.util.ArrayList;

public class AddArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		al.add("SriHair");
		al.add("Naidu");
		al.add("Pudu");
		al.add("Tutroil");

		System.out.println(al);

		ArrayList al2 = new ArrayList();

		al2.add("Nice");
		al2.add("One");
		al2.add("Two");
		al2.add("Three");

		System.out.println(al2);

		al.addAll(3, al2);

		System.out.println(al);

	}

}
