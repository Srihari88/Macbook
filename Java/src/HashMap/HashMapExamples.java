package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(111, "SriHari");
		hm.put(222, "Naidu");
		hm.put(333, "Pudu");
		hm.put(444, "Kori");

		System.out.println(hm);

		Set s = hm.entrySet();

		Iterator itr = s.iterator();

		while (itr.hasNext()) {

			Map.Entry m = (Map.Entry) itr.next();
			System.out.println(m);
		}

		String bb = hm.get(222);

		hm.remove(333);

		boolean KeyValue = hm.containsKey(111);

		System.out.println(KeyValue);

		System.out.println(bb);

		System.out.println("Map Key values after removal...");

		Set s2 = hm.entrySet();

		Iterator itr2 = s2.iterator();

		while (itr2.hasNext()) {
			Map.Entry me = (Map.Entry) itr2.next();

			System.out.println(me);
		}

		int size = hm.size();

		System.out.println(size);

		HashMap hm1 = new HashMap();
		hm1.put(666, "Srinu");
		hm1.put(777, "VasraRao");

		hm1.putAll(hm);

		System.out.println(hm1);

	}

}
