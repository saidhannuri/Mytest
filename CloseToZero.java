package ds;
import java.util.*;
public class CloseToZero 
{
	public void clsToZero(int arr[])
	{
		int i=0,temp,ele1=0,ele2=0;
		int min=arr[i+1]-arr[i];
		for (int j = 1; j < arr.length-1; j++) 
		{
			temp=arr[j+1]-arr[j];
			if(temp<min)
			{
				min=temp;
				ele2=arr[j+1];
				ele1=arr[j];
			}
		}
		System.out.println(ele1 +" "+ ele2);
	}
	public static void main(String[] args) {
		CloseToZero c=new CloseToZero();
		int arr[]={1,60,-10,70,-80,85,82};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0)
				arr[i]=0-arr[i];
		}
		Arrays.sort(arr);
		c.clsToZero(arr);
	}
}
