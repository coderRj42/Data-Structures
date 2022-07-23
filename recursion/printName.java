public class printName {
	static void Print(int n) {
		String s= "Jai";
		if(n==0) return;
		System.out.println(s);
		n--;
		Print(n);
	}
	public static void main(String[] args) {
		Print(5);
	}
 }
