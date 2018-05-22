package ds;

public class Segregate
{
	public void SegEvOdd(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0)
			{
				for (int j = i+1; j < arr.length; j++) 
				{
					if(arr[j]%2==0)
					{
						int swap=arr[j];
						arr[j]=arr[i];
						arr[i]=swap;
						break;
					}
				}
			}
		}
	}
	public void segEff(int arr[],int left,int right)
	{
		
		while(left!=right)
		{
			if(arr[left]%2!=0&&arr[right]%2==0)
			{
				int swap=arr[left];
				arr[left]=arr[right];
				arr[right]=swap;
			}
			else if(arr[left]%2!=0)
			{
				
				right--;
			}
			else
			{
				left++;
			}
				
		}
				
	}
	void print(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
					}
	}
	public static void main(String[] args) {
		Segregate s=new Segregate();
		int arr[]={4,8,1,9,5,3,2,6,7,11};
		int arr2[]={4,8,1,9,5,3,2,6,7,11};
		s.SegEvOdd(arr);
		s.print(arr);
		System.out.println("efficient method");
		
		int left=0,right=(arr.length)-1;
		
		s.segEff(arr2,left,right);
		
		s.print(arr2);
	}
}
