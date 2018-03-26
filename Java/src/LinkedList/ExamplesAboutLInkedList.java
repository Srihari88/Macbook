package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ExamplesAboutLInkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();

		ll.add("SriHari");
		ll.add(23);
		ll.add('c');

		System.out.println(ll);

		ll.addFirst("Add First Element");

		ll.addLast("Add Last Element");

		System.out.println(ll);

		Object first = ll.getFirst();

		System.out.println(first);

		Object last = ll.getLast();
		System.out.println(last);

		Object lastInd = ll.get(2);
		System.out.println(lastInd);

		System.out.println(ll.size());

		System.out.println(ll.indexOf('c'));

	}

}
