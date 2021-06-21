package recursion;
/*Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.

The task is to choose the safe place in the circle so that when you perform these operations starting from 1st place in the circle, you are the last one remaining and survive.

Example 1:

Input:
n = 3 k = 2
Output: 3
Explanation: There are 3 persons so 
skipping 1 person i.e 1st person 2nd 
person will be killed. Thus the safe 
position is 3.
 

Example 2:

Input:
n = 5 k = 3
Output: 4
Explanation: There are 5 persons so 
skipping 2 person i.e 3rd person will 
be killed. Thus the safe position is 4.
 

Your Task:
You don't need to read input or print anything. You are required to complete the function josephus () that takes two parameters n and k and returns an integer denoting safe position. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
*/
public class josephusProblem {

	 static int jos(int n, int k)
	    {
	    	if(n == 1)
	    		return 0;
	    	else
	    		return (jos(n - 1, k) + k) % n;
	    }

	    static int myJos(int n, int k)
	    {
	    	return jos(n, k) + 1;
	    }
	      
	   
	    public static void main(String args[]) 
	    { 
	        System.out.println(myJos(5, 3));  
	    } 

}
