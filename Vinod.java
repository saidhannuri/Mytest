package ds;

import java.util.Scanner;

public class Vinod 
{
	
	public int check(int i,int d,int A,int B)
	{
		int z=i-d,s=-1,m;
		if(z>A||z>B)
		{
			s=addAandB(z,A,B);
			
		}
		//System.out.println(s);
		return s;
	}
	public int addAandB(int z,int A,int B)
	{
	while(z>0)
	{
		if(z<=A&&z<=B)
			return z;
		else if(A==B&&z>=A)
		{
			z=z-A;
		}
		else if(z>=A&&z>=B)
		{
			if(A>B)
			 z=z-A;
			if(B>A)
				z=z-B;
			
		}
		
		else if(z>=A&&z<=B)
		{
			z=z-B;
		}
		else if(z>=B&&z<=A)
		{
			z=z-B;
		}
		//System.out.println(z);
	}
			
		return z;
	}
	public static void main(String[] args) 
	{
		Vinod V=new Vinod();
		int arr[]={8,12,15,16,22};
		int count,count2=0;
		System.out.println("enter D,A,B values");
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		int A=s.nextInt();
		int B=s.nextInt();
		if(A==1||B==1)
		{
			System.out.println(arr.length);
		}
		else
		{
		for (int i = 0; i < arr.length; i++)
		{
			 count=V.check(arr[i], d, A, B);
			if(count==0)
				count2=count2+1;
		}
		System.out.println(count2);
	
		}
		}
}

