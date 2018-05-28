package ds;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Arrange 
{
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
	    Arrange ar=new Arrange();
	Scanner s=new Scanner(System.in);
	
	String nums[]={"54","546","548","60"};
	String a[]={"3","30","34","5","9"};
	
		System.out.println(ar.arrnge(nums));
		System.out.println(ar.arrnge(a));
		
		
	}
}
