package ds; 
//elements must be in 1 to n 
// array size is n+2 on
public class TwoRepNo 
{
	void RepNo(int a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			if(a[a[i]]!=0)
			{
				a[a[i]]=0;
			}
			else
				System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		TwoRepNo t=new TwoRepNo();
		int a[]={5,2,3,5,3,4,4};
		t.RepNo(a);
	}
}
