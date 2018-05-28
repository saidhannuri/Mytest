package ds;

import java.util.Arrays;

public class CountTri
{
 void countTri(int a[])
 {
	 Arrays.sort(a);
	 int count=0;
	 for (int i = 0; i<a.length-2; i++) 
	 {
		 int k=i+2;
		 for (int j = i+1; j < a.length; j++)
		 {
			 while(k<a.length&&a[i]+a[j]>a[k])
			 {
				 	k++;
					count++;
								
			 }
		}
		 
		 
	}
	 System.out.println("Number of triangles possible is  "+count);
	 
 }
 public static void main(String[] args) {
	CountTri t=new CountTri();
	int arr[] =   {10, 21, 22, 100, 101, 200, 300};
	t.countTri(arr);
 }
}
