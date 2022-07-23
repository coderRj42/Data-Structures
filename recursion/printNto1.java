
public class printNto1 {
	static void f(int n) {
		if (n==0) return;
		System.out.println(n+ " ");
		f(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(5);
	}
}
