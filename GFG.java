package ds;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class GFG {
	public static long tolong(String s)
	{
		return Long.parseLong(s);
		
	}
	String arrnge(String a[])
	{
		
	   String total="";
		for (int i = 0; i <a.length; i++) 
		{
			int max=i;
			for(int j=i+1;j<a.length;j++)
			{
			String s1=a[i]+a[j];
			String s2=a[j]+a[i];
			long l1=tolong(s1);
			long l2=tolong(s2);
			if(l2>l1)
			{
				String s3=a[max]+a[j];
				String s4=a[j]+a[max];
				long l3=tolong(s3);
				long l4=tolong(s4);
				if(l3>l4)
					max=max;
				else
					max=j;
			}
				
			}
			String temp=a[max];
			a[max]=a[i];
			a[i]=temp;
			
			total=total+a[i];
		}
		 return total;
	}
	public static void main(String[] args) 
	{
	    GFG g=new GFG();
	Scanner s=new Scanner(System.in);
	
	String nums[]={"54","546","548","60"};
	String a[]={"3","30","34","5","9"};
	
		System.out.println(g.arrnge(nums));
		System.out.println(g.arrnge(a));
		int[] intArray = {441,166, 493, 43, 988, 504, 328, 730, 841, 613 };

		String strArray[] = new String[intArray.length];

		for (int i = 0; i < intArray.length; i++)
			strArray[i] = String.valueOf(intArray[i]);

		System.out.println(Arrays.toString(strArray));
		System.out.println(g.arrnge(strArray));
		
		
	}
}