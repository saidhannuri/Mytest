package ds;

public class EffMergeTwoArrays 
{
	void moveToEnd(int A[],int size)
	{
		int j=size-1;
		for (int i = size-1; i >=0; i--) 
		{
			if(A[i]!=-1)
			{
				A[j]=A[i];
				j--;
			}
		}
		for (int i = 0; i < j; i++) 
		{
			A[i]=-1;
		}
	}
	void merge(int A[],int N[],int m,int n)
	{
		int i=n,j=0,k=0;
		
		while(k<(m+n))
		{
			if((i<(m+n)&& A[i]<=N[j])||(j==n))
			{
				A[k]=A[i];
				k++;
				i++;
			}
			else
			{
				A[k]=N[j];
				k++;
				j++;
			}
		}
	}
	void print(int A[],int size)
	{
		for (int i = 0; i < size; i++) 
		{
			System.out.println(A[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		EffMergeTwoArrays em=new EffMergeTwoArrays();
		int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
	     int N[] = {5, 7, 9, 25};
	     int n=N.length;
	     int m=mPlusN.length-n;
	     int s=m+n;
	     
	    em.moveToEnd(mPlusN, s);	
	    em.merge(mPlusN, N, m, n);
	    em.print(mPlusN, s);
	}
}
