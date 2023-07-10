package Super;

class Learner
{
	public void lname() 
	{
		System.out.println("Gagana");
	}
	
	void courseName()
	//final void courseName():can't override
	//static void courseName():can't override
	{
		System.out.println("Java full Stack");
	}
	
	void courseduration()
	{
		System.out.println("4 Months");
	}
}
class Lcourse extends Learner
{
	protected void courseName()//Cannot reduce the visibility of inherited method in child class
	{
		super.courseName();
		System.out.println("Data Science");
		
	}
	
	@Override
	void courseduration()
	{
		System.out.println("2 Months");
	}
	
}



public class Method_Overridding {

	public static void main(String[] args) {
	Lcourse l=new Lcourse();
	l.courseName();
	l.lname();
	l.courseduration();
//	Learner le=new Learner();
//	le.courseName();
//	le.lname();
	}

}
