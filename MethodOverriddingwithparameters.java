package Super;
class UserInput {
    public void data(int a,int b)
    {
       System.out.println("A:"+a + "b:"+b);
    }
 }
class UserAdd extends UserInput
{ 
    public void data(int a,int b) 
    {  
    	
       System.out.println("sum:"+ a +" "+ b);
    }
} 
 



public class MethodOverriddingwithparameters 
{

	public static void main(String[] args) 
	{
		
		UserInput u=new  UserInput();
		u.data(3, 7);
		UserInput us=new UserInput();
		us.data(7, 9);
	}

}
