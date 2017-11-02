
public class Exception {

	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	// int a, b, c;
	//
	// try{
	//
	// a = 0;
	// b = 10;
	//
	// c = b / a;
	//
	// System.out.println("This line will not executed");
	// }
	// catch(ArithmeticException e)
	//
	// {
	// // e.printStackTrace();
	// }
	// System.out.println("This line will not executed after holiding ");
	// }

	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2 };
			arr[2] = 3 / 0;
		} catch (ArithmeticException ae) {
			System.out.println("divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound exception");
		}
	}
}
