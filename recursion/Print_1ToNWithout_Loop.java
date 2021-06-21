package recursion;
		
public class Print_1ToNWithout_Loop {
	static void print1toN(int n) {
		if(n==0) {
			return;
		}
		print1toN(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=4;
			print1toN(n);
	}

}
