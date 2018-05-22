package ds;

import java.util.Arrays;

public class MergeTwoArrays 
{
 void MtwoA(int MaN[],int N[])
 {
	 int count=0;
	 for (int i = 0; i < MaN.length; i++) 
	 {
		 if(MaN[i]==-1)
		 {
			 MaN[i]=N[count];
			 count++;
			 
		 }
		 
	}
	 Arrays.sort(MaN);
	 for (int i = 0; i < MaN.length; i++)
	 {
		System.out.println(MaN[i]);
	}
 }
 public static void main(String[] args)
 {
	 MergeTwoArrays m=new MergeTwoArrays();
	 
	 int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
     int N[] = {5, 7, 9, 25};
     m.MtwoA(mPlusN, N);
}
}
