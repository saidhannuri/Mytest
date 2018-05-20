package ds;

public class Rotation
{
 void Rtn(int arr[],int d)
 {
	 int n=arr.length;
	 rev(arr,0,d-1);
	 rev(arr,d,n-1);
	 rev(arr,0,n-1);
 }
 void rev(int a[],int s,int e)
 {
	 int temp;
	 while(s<e)
	 {
	 temp=a[s];
	 a[s]=a[e];
	 a[e]=temp;
	 s++;
	 e--;
	 }
 }
 static void printArray(int arr[])
 {
     for (int i = 0; i < arr.length; i++)
         System.out.print(arr[i] + " ");
 }


 public static void main (String[] args)
 {
	 Rotation r=new Rotation();
     int arr[] = {1, 2, 3, 4, 5, 6, 7};
     r.Rtn(arr, 2); 
    r. printArray(arr);
 }
}

