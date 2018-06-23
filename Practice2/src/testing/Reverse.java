package testing;

public class Reverse 
{

	public static void main(String[] args) 
	{
		String s="mounica";
		String rs ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char y=s.charAt(i);
			rs=rs+y;
			
		}
		System.out.println(rs);

	}

}
