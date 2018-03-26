package Arrays;

import java.util.ArrayList;

public class Emp {

	int Eid;
	String Ename;

	public Emp(int Eid, String Ename) {

		this.Eid = Eid;
		this.Ename = Ename;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e1 = new Emp(111, "Pudu");
		Emp e2 = new Emp(222, "SriHari");
		Emp e3 = new Emp(222, "Naidu");

		ArrayList<Emp> al = new ArrayList<Emp>();

		al.add(e1);
		al.add(e2);
		al.add(e3);

		for (Emp e : al) {
			System.out.println(e.Eid + "----" + e.Ename);
		}

	}

}
