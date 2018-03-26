
public class InstanceVariables {

	static int a = 200;
	static int b = 400;

	// static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceVariables s = new InstanceVariables();
		System.out.println(InstanceVariables.a);
		System.out.println(InstanceVariables.b);
		
		s.m1();

	}

	// Instance method
	void m1() {
		System.out.println(InstanceVariables.a);
		System.out.println(InstanceVariables.b);

	}

}
