package ArrayProgramsPractice;

public class MultiDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 3, 5, 7 }, { 6, 7, 8 }, { 4, 5, 7 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "");
			}

			System.out.println();
		}
	}

}
