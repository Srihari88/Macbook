package TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> t = new TreeSet<String>();

		t.add("Sri");
		t.add("hari");
		t.add("Naidu");
		t.add("Pudu");

		System.out.println(t);

		TreeSet<Integer> tt = new TreeSet<Integer>();

		tt.add(6);
		tt.add(90);
		tt.add(56);
		tt.add(45);

		System.out.println(tt);

		System.out.println(tt.tailSet(56));
		System.out.println(tt.headSet(56));

		SortedSet s = tt.tailSet(56);

		TreeSet ts = new TreeSet(s);

		System.out.println(ts);

	}

}