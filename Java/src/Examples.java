import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examples {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How many Subjects?");

		int n = Integer.parseInt(br.readLine());

		// Create an array

		int[] marks = new int[n];

		// Store elements into the Arrary

		for (int i = 0; i < n; i++) {
			System.out.println("Enter marks ");
			marks[i] = Integer.parseInt(br.readLine());
		}

		// Find total elements

		int tol = 0;
		for (int i = 0; i < n; i++)
			tol = tol + marks[i];

		System.out.println("Total marks =" + tol);

		// Find the percentage

		float perfentage = (float) tol / n;

		System.out.println("Total marks =" + perfentage);

	}

}
