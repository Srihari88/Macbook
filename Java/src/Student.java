
public class Student {

	int sno;
	String s_name;
	Double s_salary;
	String s_Address;

	String s_Town;
	String s_vachilename;

	Student(int sno, String s_name, Double s_salary, String s_Address) {
		this("Naidu", "Srihari");
		this.sno = sno;
		this.s_name = s_name;
		this.s_salary = s_salary;
		this.s_Address = s_Address;
	}

	Student(String s_Town, String s_vachilename) {
		this.s_Town = s_Town;
		this.s_vachilename = s_vachilename;
	}

	public void Display() {
		System.out.println("Student roll no is " + sno);
		System.out.println("Student name is " + s_name);
		System.out.println("Student salry is " + s_salary);
		System.out.println("Student address is " + s_Address);
		System.out.println("Student address is " + s_Town);
		System.out.println("Student address is " + s_vachilename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student(4, "Srihari", 5678.00, "HYD");
		s.Display();

	}

}
