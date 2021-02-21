package practice101;

public class Find_The_String {

	public static void main(String[] args) 
	{
		String test= "SmokeTesT";
		int i,count= 0;
		for(i=0; i<test.length(); i++)
		{
			if(test.charAt(i)== 't' || test.charAt(i)== 'T')
			{
				if(test.charAt(i+1)== 'e' || test.charAt(i+1)== 'E')
				{
					if(test.charAt(i+2)== 's' || test.charAt(i+2)== 'S')
					{
						if(test.charAt(i+3)== 't' || test.charAt(i+3)== 'T')
						{
							count=1;
							break;
						}
					}
				}
			}
			
		}
		if(count == 1)
		{
			System.out.println("The Sub-string 'TEST' is PRESENT in the string "+test);
		}
		else
		{
			System.out.println("Sub-string 'TEST' NOT FOUND the string "+test);
		} 

	}

}
