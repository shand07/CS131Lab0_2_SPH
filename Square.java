
public class Square
{
	private int side;
	public Square()
	{
		side = 0;
	}
	
	public Square(int i)
	{
		side = i;
	}
	
	
	public void SetSide(int squareSide)
	{
		this.side = squareSide;
	}
	
	public int GetSide()
	{
		return side;
	}
	
	public int SquareArea()
	{
		int SquareArea = (side*side);
		return SquareArea;
	}
}
