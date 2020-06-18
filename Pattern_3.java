
public class Pattern_3
{
	public static void main(String[] args) 
	{
		System.out.println("programme started");
		int lines = 5;
		int countstars = 9;
		
		for(int i = 1; i<=lines; i++)
		{
			for(int j = 1; j<=countstars; i++)
			{
				System.out.print("*");
			}
			System.out.println();
			countstars = countstars-2;
		}
	}
}
