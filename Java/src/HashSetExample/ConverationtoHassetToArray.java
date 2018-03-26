package HashSetExample;

import java.util.HashSet;

public class ConverationtoHassetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet h = new HashSet();

		h.add("Sri");
		h.add("hari");
		h.add("Naidu");
		h.add("Pudu");

		System.out.println(h);

		String[] s = new String[h.size()];

		h.toArray(s);

		for (String arr : s) {
			System.out.println(arr);
		}
	}

}
