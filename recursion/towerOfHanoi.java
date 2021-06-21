package recursion;
import java.util.*;
public class towerOfHanoi {
	 static void ToH(int n, char A, char B, char C) 
	    { 
	        if (n == 1) 
	        { 
	            System.out.println("Move 1 from " +  A + " to " + C); 
	            return; 
	        } 
	        ToH(n-1, A, C, B); 
	        System.out.println("Move " + n + " from " +  A + " to " + C); 
	        ToH(n-1, B, A, C); 
	    } 
	      
	   
	    public static void main(String args[]) 
	    { 
	    	Scanner s=new Scanner(System.in);
	        int n = s.nextInt(); 
	        ToH(n, 'A', 'B', 'C');  
	    } 

}
