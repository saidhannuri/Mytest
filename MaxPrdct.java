package ds;

public class MaxPrdct 
{
	public int maxProduct(int a[],int n)
	{
		int max_p=Integer.MIN_VALUE;
		int left=0,right=n-1;
		int curr_P;
		while(left< right)
		{
			if(a[left]<a[right])
			{
				 curr_P=a[left]*(right-left);
				left++;
			}
			else
			{
				 curr_P=a[right]*(right-left);
				 right--;
			}
			max_p=Math.max(max_p, curr_P);
		}
		return max_p;
	}
	public static void main(String[] args) {
		MaxPrdct m=new MaxPrdct();
		int a[]={8,4,1,9};
		System.out.println(m.maxProduct(a, a.length));
	}
}
