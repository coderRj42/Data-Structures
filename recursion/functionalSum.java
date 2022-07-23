
public class functionalSum {
	static int addN(int n) {
		if(n==0) return 0;;
		return n+addN(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(addN(4));
	}

}
