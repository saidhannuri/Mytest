package ds;

public class NearstSum 
{
	public void nearSum(int a[],int b[],int x)
	{
		int temp=0,near=0,m=0,n=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{ 
				if(a[i]>b[j])
				temp=a[i]-b[j];
				else
					temp=b[j]-a[i];
				if(temp>=near&&temp<=x)
				{
					near=temp;
					m=a[i];
					 n=b[j];
				}
			}
		}
		System.out.println("nearest distance is   "+near+ "  pair is (" +m+ "," + n + ")");
	}
	public static void main(String[] args)
	{
		NearstSum n=new NearstSum();
	int ar1[] = {1, 4, 5, 7,8,9};
	int ar2[] = {10, 20, 39, 40};
	
	int x = 38;
	n.nearSum(ar1, ar2, x);
		
	}
}
