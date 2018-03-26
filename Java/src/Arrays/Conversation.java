package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "Srihari", "Naidu", "Puud" };

		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));

		al.add("Kori");
		al.add("ParvathiPuram");

		for (String str : al) {
			System.out.println(str);
		}

	}

}
