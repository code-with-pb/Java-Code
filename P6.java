import java.util.*;

public class P6 {
	char ch;
	void Char() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Char: ");
		ch = sc.next().charAt(0);
	}
	void show() {
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("This is Alphabate = "+ch);
		}
		else {
			System.out.println("This is not alphaate = "+ch);
		}
	}
	public static void main(String args[]) {
		P6 o = new P6();
		o.Char();
		o.show();
	}
}
