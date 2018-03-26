
public class TestCon {

	int Eid;
	String Ename;
	Double ESal;
	String EAddress;
	int EVachile_no;

	TestCon(int Eid, String Ename, Double ESal) {
		this.Eid = Eid;
		this.Ename = Ename;
		this.ESal = ESal;
	}

	TestCon(String EAddress, int EVachile_no) {
		this.EAddress = EAddress;
		this.EVachile_no = EVachile_no;
	}

	public void Display() {
		System.out.println("Employee id " + Eid);
		System.out.println("Employee name " + Ename);
		System.out.println("Employee Sal" + ESal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestCon t = new TestCon(10, "Sri", 1000.66);
		t.Display();

	}

}
