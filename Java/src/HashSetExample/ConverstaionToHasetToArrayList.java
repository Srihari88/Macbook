package HashSetExample;

import java.util.ArrayList;
import java.util.HashSet;

public class ConverstaionToHasetToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet h = new HashSet();

		h.add("Sri");
		h.add("Hari");

		System.out.println(h);

		ArrayList l = new ArrayList(h);

		System.out.println(l);
	}

}
