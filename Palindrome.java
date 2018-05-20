package ds;

import java.util.Scanner;

public class Palindrome 
{
 public int Plin(int givenNo)
 {
	int n=givenNo,revInt=0,remainder;
	if(n<10)
		return n;
	else
	{
	while(n!=0)
	{
		remainder=n%10;
		revInt=revInt*10+remainder;
		n=n/10;
	}
	if(givenNo==revInt)
		return givenNo;
	}
	return 0;
	
 }
 public static void main(String[] args) 
 {
	 Palindrome p=new Palindrome();
	Scanner s=new Scanner(System.in);
	System.out.println("enter limit");
	int n=s.nextInt();
	if(n<10)
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	else
	{
		for(int i=0;i<n;i++)
		{
			int k=p.Plin(i);
			if(k!=0)
				System.out.println(k);
		}
		
	}
}
}

