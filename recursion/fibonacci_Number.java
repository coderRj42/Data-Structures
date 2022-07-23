//example of multiple recurssion 
public class fibonacci_Number {
	static int fibo (int n) {
		if(n<=1)return n;
		int last = fibo(n-1);
		int slast= fibo(n-2);
		return last +slast;
	}
	public static void main(String[] args) {
		System.out.println(fibo(4));

	}

}
