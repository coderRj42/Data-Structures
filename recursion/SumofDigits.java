package recursion;

public class SumofDigits {
	static int fun(int n)
	{
		if(n < 10)
			return n;

		return fun(n / 10) + n % 10;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        int n = 687;
		 
		        System.out.println(fun(n));
		    }
	}

}
