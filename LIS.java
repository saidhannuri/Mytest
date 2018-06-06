package ds;

public class LIS 
{
	public int subSeq(int a[],int n)
	{
		int max=0,count=0;
		int list[]=new int[n];
		for (int i = 0; i < n; i++) {
			list[i]=1;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if(a[i]>a[j]&&list[i]<list[j]+1)
				{
					list[i]=list[j]+1;
					
				}
				}
		}
		for (int i = 0; i < list.length; i++) {
			if(max<list[i])
				max=list[i];
		}
		for (int i = 0; i < list.length; i++) {
			count=count+list[i];
		}
		System.out.println(count);
		return max;
	}
	public static void main(String[] args) {
		LIS l=new LIS();
		int arr[] = { 1, 2, 3, 4 };
        int n = arr.length;
        System.out.println("Length of lis is " + l.subSeq( arr, n ) );
	}
}
