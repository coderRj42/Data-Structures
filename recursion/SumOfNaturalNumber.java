package recursion;

public class SumOfNaturalNumber {
	
	public static int getSum (int n)
	{
		if(n <= 1) {
			return n;
		}
		return n+ getSum(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	        System.out.println(getSum(n));
	}

}
