package Arrays;

import java.util.ArrayList;

public class SriHari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		al.add("SriHari");
		al.add("Naidu");

		al.add("Pudu");
		al.add(10.5);
		al.add(900);

		System.out.println("The object is arrayList" + al);
		al.add(2, 100);
		System.out.println("The object is arrayList" + al);

		Object ind = al.get(4);

		System.out.println("The object is arrayList" + ind);

		al.set(3, 10000);

		System.out.println(al);

		al.remove(2);

		System.out.println("The object is arrayList" + al);

		System.out.println(al.contains("Naidu"));

		System.out.println(al.isEmpty());

		al.clear();

		System.out.println("The object is arrayList" + al);
		System.out.println(al.isEmpty());

	}

}