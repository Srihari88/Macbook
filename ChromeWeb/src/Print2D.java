
public class Print2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][] = { { 1, 3, 5, 6 }, { 5, 6, 7, 7 }, { 5, 7, 9, 0 } };

		PrintNumbers(m);

	}

	public static void PrintNumbers(int m[][]) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println(m[i][j] + " ");

			}
		}
	}
}
