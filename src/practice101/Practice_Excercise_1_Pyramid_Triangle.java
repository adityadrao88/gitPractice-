package practice101;

public class Practice_Excercise_1_Pyramid_Triangle {

	public static void main(String[] args) 
	{
		int count =1;
		for(int i=4; i>=1; i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(count++ + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int count1=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count1++ + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//int count2=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int count2=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count2++*3 + "\t");
			}
			System.out.println();
		}

	}

}
