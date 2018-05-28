package ds;

public class MaxSumInCr 
{
	int maxSum(int a[])
	{
		int maxsum_ending=0,max_so_far=0;
		for (int i = 0; i < a.length; i++) 
		{
			maxsum_ending+=a[i];
			if(maxsum_ending<0)
				maxsum_ending=0;
			if(max_so_far<maxsum_ending)
				max_so_far=maxsum_ending;
		}
		return max_so_far;
	}
	int maxCrSum(int a[])
	{
		int maxsum=maxSum(a);
		int max_wrap=0;
		for (int i = 0; i < a.length; i++) {
			max_wrap+=a[i];
			a[i]=-a[i];
		}
		max_wrap=max_wrap+maxSum(a);
		return (max_wrap>maxsum)?max_wrap:maxsum;
	}
	public static void main(String[] args) {
		MaxSumInCr m=new MaxSumInCr();
		int a[] =  {11, 10, -20, 5, -3, -5, 8, -13, 10};
        System.out.println("Maximum circular sum is " +m.maxCrSum(a));
	}
}
