import java.util.*;

public class P7 {
	char ch;
	void ip() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Char: ");
		ch = sc.next().charAt(0);
	}
	void op() {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
			System.out.println("The Char is vowel: "+ch);
		}
		else {
			System.out.println("The Char is not vowel: "+ch);
		}
	}
	public static void main(String args[]) {
		P7 o =new P7();
		o.ip();
		o.op();
	}
}
