package ds;
import java.util.*;
public class KthLaEle 
{
	public void kthLargestEle(int a[],int k)
	{
		for (int i = 0; i < k; i++) 
		{
			int max=a[i];
			for (int j = 1; j < a.length; j++)
			{
				if(a[j]>max)
				{
					int temp=max;
					max=a[j];
					a[j]=temp;
				}
			}
			System.out.println(max);
		}
	}
	public void mergeSort(int a[],int left,int right)
	{
		if(left<right)
		{
		int mid=(left+right)/2;
		mergeSort(a,left,mid);
		mergeSort(a, mid+1, right);
		merge(a,left,mid+1,right);
		}
		
	}
	public void merge(int a[],int left,int mid,int right)
	{
		int n1=mid-left+1;
		int n2=right-mid;
		int l[]=new int[n1];
		int r[]=new int[n2];
		for (int i = 0; i < l.length; ++i) {
			l[i]=a[left+i];
		}
		int z=0;
		for (int i = 0; i < r.length; ++i) {
			 z=mid+1+i;
			r[i]=a[z];
		}
		int i=0,j=0;
		int k=1;
		while(i<n1&&j<n2)
		{
			if(l[i]<=r[j])
			{
				a[k]=l[i];
						i++;
				
			}
			else
			{
				a[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k]=l[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=r[j];
			j++;
			k++;
		}
		
	}
	static void printArray(int arr[],int k)
    {
        int n = arr.length;
        for (int i=0; i<k; ++i)
            System.out.print(arr[n-i] + " ");
        System.out.println();
    }
	public static void main(String[] args) {
		KthLaEle e=new KthLaEle();
		int a[]={1,23,12,9,30,3,50,40,87,21,55,10};
		e.kthLargestEle(a, 3);
		e.mergeSort(a, 0, a.length-1);
		e.printArray(a, 3);
	}
}
