package HashSetExample;

import java.util.HashSet;

public class Example1 {

	public static void main(String[] args) {

		HashSet h = new HashSet();

		h.add(10);
		h.add("Sri");
		h.add("A");
		h.add("Z");
		h.add("S");
		h.add(null);
		System.out.println(h);

		System.out.println(h.add("A"));

		h.clear();

		System.out.println(h);
	}

}