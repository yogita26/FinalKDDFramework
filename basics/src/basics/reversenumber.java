package basics;

public class reversenumber {
	
    public reversenumber() {
		// TODO Auto-generated constructor stub
	}
	public reversenumber(int a)
    {
    	System.out.println("value of"+ a);
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//reversenumber s=new reversenumber();
	
		int n,r,p=0;
		n=123;
		while(n!=0)
		{
		r=n%10;
		p=p*10+r;
		n=n/10;		
		}
   System.out.println(p);	
	}

}
