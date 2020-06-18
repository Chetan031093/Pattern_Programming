
/*
write a java programme to draw a below given pattern.

        *
        **
        ***
        ****
        *****
*/
public class Pattern
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAMME STARTED");
		int lines = 5;
		int starcounts = 1;
		
		for(int i = 1; i<=5; i++)
		{
			for(int j=1; j<=starcounts; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			starcounts++;
		}
		System.out.println("programme ended");
		
	}
}
