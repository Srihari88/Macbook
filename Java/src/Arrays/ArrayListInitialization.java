package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Pratap", "Peter", "Harsh"));

		ArrayList<String> obj1 = new ArrayList<String>(Arrays.asList("Sri", "Hari", "Naidu"));
		System.out.println(obj);
		System.out.println(obj1);

	}

}
