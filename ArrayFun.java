
public class ArrayFun 
{
	private Square[] myArray = new Square[6];
	
	public ArrayFun()
	{
				
		for(int i=0; i<myArray.length; i++)
		{
			myArray[i] = new Square(i);
			
			
		}
	
	}
	
	
	public void setArrayItem(int index, Square s)
	{
		myArray[index] = s;
	}
	
	public Square getArrayItem(int index)
	{
		return myArray[index];
	}
	
	public void forward()
	{
		for(int i=0; i<myArray.length; i++) 
		{
			System.out.println(myArray[i].SquareArea());
		}
	}
	
	
	public void backward()
	{
		for(int i=5; i>-1; i--)
		{
			System.out.println(myArray[i].SquareArea());
		}
	}
	
	public void sum()
	{
		int s=0;
		for(int i = 0; i<myArray.length; i++)
		{
			
			s=s+myArray[i].SquareArea();
			
			
		}
		System.out.println(s);
	}

}