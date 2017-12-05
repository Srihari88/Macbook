
class Names {

	public int roll_no;
	public String std_name;

	Names(int roll_no, String std_name) {

		this.roll_no = roll_no;
		this.std_name = std_name;

	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Names[] arry = new Names[5];

		arry[0] = new Names(1, "Sri");
		arry[1] = new Names(2, "Srii");
		arry[2] = new Names(3, "Sru");
		arry[3] = new Names(4, "Sti");
		arry[4] = new Names(5, "Sryi");

		for (int i = 0; i <= arry.length; i++) {
			System.out.println("Element at " + i + " : " +
                    arry[i].roll_no +" "+ arry[i].std_name);
		}

	}

}
