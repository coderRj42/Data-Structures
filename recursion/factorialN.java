
public class factorialN {
	static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
//O(n) tc
//sc o(N)