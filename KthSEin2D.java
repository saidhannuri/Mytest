package ds;

import java.util.Scanner;

public class KthSEin2D 
{
	public void heapSort(int a[])
	{
		int n=a.length;
		for (int i = n/2-1; i >=0; i--)
		{
			heapify(a,n,i);
		}
		for (int i=n-1; i>=0; i--)
        {
            
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
	}
	void heapify(int a[],int n,int i)
	{
		int max=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && (a[l]>a[max]))
			max=l;
		if(r<n && a[r]>a[max])
			max=r;
		if(max!=i)
		{
			int swap=a[i];
			a[i]=a[max];
			a[max]=swap;
			heapify(a, n, max);
		}
	}
	static void printArray(int arr[],int k)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println(" k th smallest elelment in 2d array is");
        System.out.println(arr[k]);
        
    }
	public static void main(String[] args) {
		KthSEin2D kth=new KthSEin2D();
		int a[][]={{10,20,30,40},{15,25,35,40},{24,29,37,48},{32,33,39,50}};
		int arr[]=new int[16];
		int count=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[count]=a[i][j];
				count++;
			}
		}
		kth.heapSort(arr);
		System.out.println("enter k value");
		Scanner s=new Scanner(System.in);
		
		int k=s.nextInt();
		kth.printArray(arr,k-1);
	}

}

