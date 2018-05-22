package ds;

import java.util.Arrays;
import java.util.HashSet;

public class SumOf2Ele 
{
	void sum(int a[],int num)
	{
		HashSet<Integer> h=new HashSet<Integer>();
		/*for (int i = 0; i < a.length; i++) {
			h.add(a[i]);
		}*/
		for (int i = 0; i < a.length; i++) {
			int temp=num-a[i];
			if(temp!=0&h.contains(temp))
			{
				System.out.println("("+a[i]+","+temp+")");
			}
			h.add(a[i]);
		}
	}
	void sorting(int a[],int num)
	{
		Arrays.sort(a);
		int l=0,r=a.length-1;
		while(l<r)
		{
			if(a[l]+a[r]==num)
			{
				System.out.println("("+a[l]+","+a[r]+")");
				return;
			}
			else if(a[l]+a[r]<num)
			{
				l++;
			}
			else
				r--;
		}
		return;
	}
	public static void main(String[] args) {
		SumOf2Ele s=new SumOf2Ele();
		int A[] = {1, 4, 45, 6, 10, 8,8};
        int n = 16;
        s.sum(A, n);
        s.sorting(A, n);
	}
}
