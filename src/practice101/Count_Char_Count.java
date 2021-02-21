package practice101;

public class Count_Char_Count {

	public static void main(String[] args)
	{
		String test= "GeeksForGeeks";
		int i, count=0;
		
		for(i=0; i< test.length(); i++)
		{
			if(test.charAt(i)=='e')
				count++;
		}
		System.out.println("The number of 'e' in the string 'GeeksForGeeks' is="+count);
		

	}

}
