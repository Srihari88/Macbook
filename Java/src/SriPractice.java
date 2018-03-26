
public class SriPractice {
	
	int a=100;
	int b=200;
	
	
	SriPractice(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void display(){
		System.out.println("Value a is " +a);
		System.out.println("Value a is " +b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SriPractice sp= new SriPractice(12,13);
		sp.display();

	}

}
