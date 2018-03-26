package Arrays;

import java.util.ArrayList;

public class CollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Sri");
		al.add("Hari");
		al.add("Naidu");
		al.add("Pudu");

		String[] s = new String[al.size()];

		al.toArray(s);

		for (String str : al) {
			System.out.println(str);
		}

		ArrayList al1 = new ArrayList();

		al1.add("Sri");
		al1.add(10);
		al1.add('N');
		al1.add(100.67);

		Object[] oo = al1.toArray();

		for (Object o : oo) {
			System.out.println(o);
		}
	}

}
