
public class Application 
{
	public static void main(String[] args)
	{
		ArrayFun A1 = new ArrayFun();
		
		
		for(int i = 0; i< 6; i++)
		{
			
		}
	
		
		
		
		
		A1.getArrayItem(2);
		
		
		for (int index = 0; index < 6; index++)
		{
			System.out.println(A1.getArrayItem(index).GetSide()); 

		}
	
		A1.forward();
		A1.backward();
		A1.sum();
	}
	
}
