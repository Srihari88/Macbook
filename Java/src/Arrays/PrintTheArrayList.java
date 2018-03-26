package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintTheArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(100);
		al.add(200);
		al.add(300);

		// for (int prt : al) {
		// System.out.println(prt);
		// }

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
