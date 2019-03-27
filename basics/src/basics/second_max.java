package basics;

public class second_max {

	public static void main(String[] args) 
	{
		int[] a={3,60,55,97,7,10};
		int max=a[0],secondheighest=max;
		
		for(int i=1;i<a.length;i++)
		{
			
			if(max<a[i])
			{	
				secondheighest=max;
				max=a[i];
				System.out.println(max);
			}
			
		}
		//System.out.println(max);

	}

}
