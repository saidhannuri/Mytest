package ds;

public class FindngReptdEl 
{
 void repEle(int a[])
 {
	 for (int i = 0; i < a.length; i++) 
	 {
		 if(a[Math.abs(a[i])]>=0)
		 {
			 a[Math.abs(a[i])]=-a[Math.abs(a[i])];
			 System.out.println("ele are   "+a[Math.abs(a[i])]);
		 }
		 else 
			 	System.out.println(Math.abs(a[i]));
	}
 }
 public static void main(String[] args) {
	FindngReptdEl r=new FindngReptdEl();
	int a[]={10,2,3,10,3,6,6};
	r.repEle(a);
}
}
