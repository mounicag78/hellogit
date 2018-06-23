package testing;

import java.util.ArrayList;

public class List 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> l= new ArrayList<Integer>(5);
		l.add(56);
		l.add(78);
		l.add(2);
		l.add(0);
		l.add(100);
		int max,min,i;
		max=l.get(0);
		min=l.get(0);
		for(i=0;i<l.size();i++)
		{
			if(min>l.get(i))
			{
				min=l.get(i);
			}
			if(max<l.get(i))
			{
				max=l.get(i);
			}
		}
		System.out.println("max value "+ max);
		System.out.println("min value "+ min);
		
	}

}
