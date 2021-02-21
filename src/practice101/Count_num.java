package practice101;

public class Count_num {

	public static void main(String[] args) 
	{
		int count=1,a,b,i;
		
		for(i=10; i<=99; i++)
		{
			a=i/10;
			b=i%10;
			if (a==1)
			{
				count++;
			}
			if(b==1)
			{
				count++;
			}
			
		}
		
		System.out.println("The number 5 repeated in the count from 1 to 99 is=" +count);

	}

}
