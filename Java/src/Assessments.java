
public class Assessments {

	int a = 450;
	Double b = 50.7;
	static int c = 700;
	static float d = 800;

	void m1() {
		System.out.println(+a);
		System.out.println(+b);
		System.out.println(Assessments.c);
		System.out.println(Assessments.d);
	}

	static void m2() {
		System.out.println(new Assessments().a);
		System.out.println(new Assessments().b);
		System.out.println(Assessments.c);
		System.out.println(Assessments.d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assessments s = new Assessments();
		s.m1();
		s.m2();

	}

}
