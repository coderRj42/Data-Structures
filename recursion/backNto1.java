
public class backNto1 {

	static void back(int i,int n) {
		if(i<1) return ;
		System.out.println(i + " ");
		back(i-1,n);
	}
	public static void main(String[] args) {
		back(5,5);
	}

}



