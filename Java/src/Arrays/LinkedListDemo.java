package Arrays;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Srihari");
		linkedlist.add("Naidu");
		linkedlist.add("Pudu");
		linkedlist.add("Kori");

		System.out.println("The list of elements on the linked list is" + linkedlist);

		linkedlist.addFirst("Kori Villiage");
		linkedlist.addLast("ParvathiPuram");

		System.out.println("The list of elements on the linked list is" + linkedlist);

		String fir_pre = linkedlist.getFirst();
		System.out.println(fir_pre);

		String last_pre = linkedlist.getLast();
		System.out.println(last_pre);

		System.out.println("The list of elements on the linked list is" + linkedlist);

		linkedlist.remove(1);
		linkedlist.removeLast();
		linkedlist.removeFirst();
		System.out.println("The list of elements on the linked list is" + linkedlist);

		int l_size = linkedlist.size();

		System.out.println(l_size);

		boolean b = linkedlist.isEmpty();
		System.out.println(b);

		boolean con = linkedlist.contains("Pudu");

		System.out.println(con);

		linkedlist.set(2, "Updated name");
		System.out.println("The list of elements on the linked list is" + linkedlist);

		// Print all elements using the for loop
		System.out.println("********For loop*******");
		for (int i = 0; i < linkedlist.size(); i++) {
			System.out.println("THE ELEMENTS IN LINKEDLIST IS " + linkedlist.get(i));
		}

		// Print all elements using for-each loop
		System.out.println("********For each loop*******");
		for (String list : linkedlist) {
			System.out.println(list);
		}
		// Print all elements using iterator

		System.out.println("********Iterator*******");
		Iterator itr = linkedlist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("The list of elements on the linked list is" + linkedlist);

		Object duplicate = linkedlist.clone();

		System.out.println("The duplicate object is " + duplicate);

		System.out.println("********While loop*******");

		int num = 0;

		while (linkedlist.size() > num) {

			System.out.println(linkedlist.get(num));
			num++;
		}
	}

}