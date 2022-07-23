
public class checkPalindrome {
	static Boolean palindrome(int i,String s) {
		if(i>s.length()/2) return true;
		char[] ch=s.toCharArray();
		if(ch[i]!=ch[s.length()-i-1])	return false;
		return palindrome(i+1,s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="racecar";
		System.out.println(palindrome(0, s));
	}

}
