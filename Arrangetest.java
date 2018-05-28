package ds;

import java.util.Scanner;
import java.util.Vector;

public class Arrangetest
{

	public static long tolong(String s)
	{
		return Long.parseLong(s);
		
	}
	
	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();
		String a[]={"1","34","548","3","9","98","76","45","4"};
		
		long max_f=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
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
		
		System.out.println(total);
		
	}
}
