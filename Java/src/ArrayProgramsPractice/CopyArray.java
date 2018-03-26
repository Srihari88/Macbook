package ArrayProgramsPractice;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] scrAry = { 'c', 'b', 'n', 'm', 'v', 'c', 'g', 'f', 'h', 'j' };

		char[] copyAry = new char[7];

		System.arraycopy(scrAry, 2, copyAry, 0, 4);

		System.out.println(new String(copyAry));

	}

}
