package ArrayProgramsPractice;

import java.util.ArrayList;

public class ConvertArrayListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();

		al.add("Sri");
		al.add("Hari");
		al.add("Naidu");

		System.out.println(al);

		String[] s = new String[3];

		al.toArray(s);

		for (String string : al) {
			System.out.println(string);
		}
	}
}