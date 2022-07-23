import java.util.*;
public class reverseAnArray {
	static int[] reverse(int arr[],int i,int n) {
	if(i>n/2) return arr ;
	swap(arr,i,n-i-1);
	return reverse(arr, i+1, n);
	}
	static void swap(int arr[],int i,int n) {
		int temp;
		temp=arr[i];
		arr[i]=arr[n];
		arr[n]=temp;
		}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
		}
	reverse(arr, 0, n);
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]+" ");
		s.close();
	}
	}

}
