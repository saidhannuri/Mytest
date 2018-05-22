package ds;

public class NearSumEff 
{
	public void nearSum(int a[],int b[],int x)
	{
		int diff=99999,m=0,n=0;
		int l=0,r=b.length-1;
		while(l<a.length && r>=0)
		{
			if(Math.abs(a[l]+b[r]-x)<diff)
			{
				m=l;
				n=r;
				diff=Math.abs(a[l]+b[r]-x);
			}
			if(a[l]+b[r]>x)
				r--;
			else
				l++;
		}
		System.out.println("  pair is (" +a[m]+ "," + b[n] + ")");
	}
	public static void main(String[] args)
	{
		NearSumEff n=new NearSumEff();
	int ar1[] = {1, 4, 5, 7,8,9};
	int ar2[] = {10, 20, 39, 40};
	
	int x = 38;
	n.nearSum(ar1, ar2, x);
		
	}
}
