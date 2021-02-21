package practice101;

public class Practice_Excercise_2_Smallest_Number {

	public static void main(String[] args) 
	{
		int a[][]= {{20,6,8},{2,50,9},{2,3,1}};
		
		int small=a[0][0];
		int min_col=0;
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if (small>=a[i][j])
				{
					small=a[i][j];
					min_col=j;
					
				}
			}
		}
		System.out.println("The smallest number is = "+ small);
		System.out.println("The column in which the minimum number found is = "+min_col);
		int maxi=0;
		for(int i=0; i<3;i++)
		{
				if (maxi<=a[i][min_col])
				{
					maxi=a[i][min_col];
				
				}				
				
		}
		System.out.println("The maximum number in the column "+ min_col +" is = "+maxi);
		
		
		
		int max=a[0][0];
		int column=0;
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if (max<=a[i][j])
				{
					max=a[i][j];
					column=j;
				
				}
					
				
			}
		}
		System.out.println("The maximum number is = "+ max);
		System.out.println("The column in which the maximum number found is = "+column);

	}

}
