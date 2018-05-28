package ds;

public class TwoOddNum 
{
	public void TOddN(int a[])
	{
		int xor2=a[0];
		int set_bit_no;
		//int i,size=a.length-2;
		int x=0,y=0;
		for (int j = 1; j < a.length; j++) {
			xor2=xor2 ^ a[j];
		}
		set_bit_no=xor2 & ~(xor2-1);
		for (int j = 0; j < a.length; j++) {
			if((a[j]&set_bit_no)>0)
				x=x^a[j];
			else
				y=y^a[j];
			}
		System.out.println("The two ODD elements are "+
                x + " & " + y);
	}
	public static void main(String[] args) {
		TwoOddNum t=new TwoOddNum();
		int arr[] = {4, 2, 4, 5, 2, 3, 3, 1};
		t.TOddN(arr);
	}
}
