package ds;

public class Equilbrium
{
	void eqSum(int a[])
	{
		int sum=0,leftsum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		for (int i = 0; i < a.length; i++) {
			sum=sum-a[i];
			if(sum==leftsum)
			{
				System.out.println("Equilibrium point is --> " +i);
				return;
			}
			leftsum+=a[i];
			}
	}
	void inEff(int a[])
	{
		int  ls,rs;
		for(int i=0;i<a.length;i++)
		{
			  ls=0;
			  rs=0;

			for(int l=0;l<i;l++)
			{
				ls=ls+a[l];
				
			}
			for(int r=i+1;r<a.length;r++)
			{
				rs=rs+a[r];
				
			}
			if(ls==rs)
			{
				System.out.println("Equilibrium point is --> " +i);
				return;
				
			}
			
				
		}
		
	}
	public static void main(String[] args) {
		Equilbrium e=new Equilbrium();
		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		e.eqSum(arr);
		e.inEff(arr);
	}
	
}
