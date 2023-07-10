package Super;

class A{
	int age=40;
	int rno=1;
	
	void displayA()
	{
		System.out.println(age);
	}
	
	class B extends A
	{
		int age=20;
		void display()
		{
			System.out.println(age);
		}
	}
}

public class superasvariable {

	public static void main(String[] args) {
		B b=new B();
		b.dispaly();
	}

}
