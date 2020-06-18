
public class Pattern1 
{ 	
	public static void main(String[] args)
	{
		System.out.println("programme stated");
		String str = "*";
		
		for(int i = 1; i<=5; i++)
		{
			System.out.println(str);
			str= str + "*";
		}
		System.out.println("programme ended");
	}
}
