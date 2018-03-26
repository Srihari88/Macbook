
 class Inher {
	Inher(int a) 
	{
		System.out.println("Parent class 1- arg cons");
	}

}

class Childs extends Inher 
{
	Childs() 
	{
		super(10);
		System.out.println("Child class 0-args constructor");
	}

	public static void main(String[] args) {
		new Childs();
	}
}
