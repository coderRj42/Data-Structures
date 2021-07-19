import java.util.*;
import java.io.*;
import java.lang.*;



class main
{ 
	
	

	static int firstOccurrence(int arr[], int n, int x)
	{
		for(int i = 0; i < n; i++)
			if(arr[i] == x)
				return i;

		return -1;
	}

	public static void main(String args[]) 
    {
        int arr[] = {5, 10, 10, 15, 15}, n = 5;

		int x = 15;
    
        System.out.println(firstOccurrence(arr, n, x));
		
    } 

}
