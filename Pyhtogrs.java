package ds;

import java.util.Arrays;
//import java.util.Arrays;
import java.util.HashSet;

public class Pyhtogrs 
{
	void sum(int a[],int num)
	{
		HashSet<Double> h=new HashSet<Double>();
		/*for (int i = 0; i < a.length; i++) {
			h.add(a[i]);
		}*/
		for (int i = 0; i < a.length; i++) {
			double temp=Math.pow(num,2)-Math.pow(a[i],2);
			if(temp!=0&h.contains(temp))
			{
				System.out.println("("+a[i]+","+Math.sqrt(temp)+","+num+")");
			}
			h.add(Math.pow(a[i],2));
		}
	}
	boolean sorting(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			a[i]=a[i]*a[i];
		}
		Arrays.sort(a);
		for (int i = a.length-1; i >=2 ; i--)
		{
			int l=0,r=i-1;
		while(l<r)
		{
			if(a[l]+a[r]==a[i])
			{
				return true;
				
			}
			else if(a[l]+a[r]<a[i])
			{
				l++;
			}
			else
				r--;
		}
		}
		return false;
	}
	public static void main(String[] args) {
		Pyhtogrs p=new Pyhtogrs();
		int A[] = {1, 4, 3, 6, 5};
        
        for(int i=0;i<A.length;i++)
        {
        	p.sum(A, A[i]);
        }
        if(p.sorting(A))
        	System.out.println("triplet is available");
        else
        	System.out.println("no triplet is availble");
	}
}
