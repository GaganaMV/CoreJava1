package Super;
public class Thisex {
	
	int a,b,c;
	
	Thisex()
	{
		
		System.out.println("My Default Constructor");
	}
	
	Thisex(int a,int b,int c){
		this();
		this.a=a;
		this.b=b;
		this.c=c;
	}
     
	//public void setdata(int a,int b,int c1)
	
	void msg()
	{
		System.out.println("Hi ");
	}
	 
	
	
	public void displaydata()
	{
		this.msg();
		System.out.println("Value of a:" +a);
		System.out.println("Value of b:" +b);
		System.out.println("Value of c:" +c);
	}
	
	
	public static void main(String[] args)
	{
		This t=new This();
		t.setdata(10, 9,20);
		t.displaydata();

	}

}


