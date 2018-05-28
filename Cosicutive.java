package ds;

import java.util.Arrays;

public class Cosicutive
{
	public void Cnsctv(int a[])
	{
		Arrays.sort(a);
		int flag=0;
		for (int i = 1; i < a.length; i++)
		{
			if(a[i]-a[i-1]==1)
			{
				flag=1;
			}
		}
		if(flag==1)
			System.out.println("consective numbers");
		else
			System.out.println("no consective nos");
	}
	boolean eff(int a[])
	{
		int min=getMin(a);
		int Max=getMax(a);
		boolean visit []= new boolean[a.length];
		if(Max-min+1==a.length)
		{
			for (int i = 0; i < a.length; i++) 
            {
                
                if (visit[a[i] - min] != false)
                    return false;
 
                visit[a[i] - min] = true;
            }
             
            return true;
		}
		return false;
	}
	int getMin(int a[])
	{
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	int getMax(int a[])
	{
		int Max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(Max<a[i])
				Max=a[i];
		}
		return Max;
	}
	public static void main(String[] args) {
		Cosicutive c=new Cosicutive();
		int a[]={5,6,1,3,2,4};
		c.Cnsctv(a);
		if(c.eff(a))
		{
			System.out.println("consective numbers");
		}
		else
			System.out.println("not a consective numbers");
	}
}
