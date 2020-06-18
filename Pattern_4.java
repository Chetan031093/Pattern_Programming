/*
 * 
 * wirte a java programme to draw below pattern.
 * 
 *            *
              ***
              *****
              *******
              *********
 */

public class Pattern_4 
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAMME STARTED");
		int lines = 5;
		int starcounts = 1;
		
		for(int i = 1; i<=lines; i++)
		{
			for(int j=1; j<=starcounts; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			starcounts = starcounts+2;
		}
		System.out.println("programme ended");
		
	}

}
