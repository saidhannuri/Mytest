package ds;

import java.util.Arrays;

public class FourEleSum 
{
	void FrelSum(int a[],int x)
	{
		Arrays.sort(a);
		int l,r;
		for (int i = 0; i < a.length-3; i++)
		{
		 for (int j = i+1; j < a.length-2; j++)
		 {
			  l=j+1;
			  r=a.length-1;
			 while(l<r)
			 {
				 if(a[i]+a[j]+a[l]+a[r]==x)
				 {
					 System.out.println(a[i]+","+a[j]+","+a[l]+","+a[r]);
					 l++;
					 r--;
				 }
				 else if(a[i]+a[j]+a[l]+a[r]<x)
					 l++;
				 else
					 r--;
			 }
		 }	
		}
	}
	public static void main(String[] args) {
		FourEleSum f=new FourEleSum();
		int A[] = {1, 4, 45, 6, 10, 12};
        
        int X = 21;
        f.FrelSum(A, X);
	}
}
