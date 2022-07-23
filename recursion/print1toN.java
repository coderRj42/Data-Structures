
public class print1toN {
	static void f(int n) {
		if (n==0) return;
		f(n-1);
		System.out.println(n+ " ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(5);
	}

}
