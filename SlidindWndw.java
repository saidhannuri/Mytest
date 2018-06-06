package ds;

public class SlidindWndw 
{
	public void slidingWindow(int a[],int k,int n)
	{
		int a2[]=new int[k];
		int count=0;
		for (int i = 0; i < (a.length-k)+1; i++) 
		{
			for (int j = i; j < a2.length+i; j++) {
				a2[count]=a[j];
				count++;
			}
			System.out.println(max(a2));
			count=0;
		}
	}
	int max(int arr[])
	{
		int l=0,r=arr.length-1;
		int m=0;
		while(l<r)
		{
			if(arr[l]<arr[r])
			{
				m=arr[r];
				l++;
			}
			else
			{
				m=arr[l];
			r--;
			}
		}
		return m;
	}
	public static void main(String[] args)
	{
		SlidindWndw s=new SlidindWndw();
		int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		s.slidingWindow(arr, 4, arr.length);
	}
}
