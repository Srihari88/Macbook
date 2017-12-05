import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
	}
}
