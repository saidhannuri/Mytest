package ds;

public class LargerEleNextToSmaller 
{
	public void maxD(int a[])
	{
		int max_diff=0,diff=0,min_ele=a[0];
		for (int i = 0; i < a.length; i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]<a[j])
			{
				diff=Math.abs(a[i]-a[j]);
				if(diff>max_diff)
					max_diff=diff;
			}
		}
		}
		System.out.println(max_diff);
	}
	void Eff(int a[])
	{
		int max_diff=a[1]-a[0],min_ele=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]-min_ele>max_diff)
			{
				max_diff=a[i]-min_ele;
			}
			if(a[i]<min_ele)
				min_ele=a[i];
		}
		System.out.println(max_diff);
	}
	public static void main(String[] args) {
		int ar[]={2,3,10,6,4,8,10};
		int arr[] = {17, 10,9, 5, 6, 3, 2};
		LargerEleNextToSmaller d=new LargerEleNextToSmaller();
		d.maxD(arr);
		d.Eff(arr);
	}
}
