
public class parameterSum {
	static void addN(int i , int sum) {
		if(i<1) {
			System.out.println(sum);
			return;
		}
		
		addN(i-1,sum+i);
		}
	public static void main(String[] args) {
		addN(4,0);
	}

}
