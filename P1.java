import java.util.Scanner;

public class P1 {
	int a,b,c;
	void val() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No1 value: ");
		a = sc.nextInt();
		System.out.print("Enter No2 Value: ");
		b = sc.nextInt();
		System.out.print("Enter NO3 Value: ");
		c = sc.nextInt();
	}
	void high() {
		if(a > b && a > c && b == c) {
			System.out.println("THe Highest Value is = "+a);
		}
		else if(b > a && b > c && a == c) {
			System.out.println("The Highest Value is = "+b);
		}
		else if(c > a && c > b && a == b) {
			System.out.println("The Highest Value is = "+c);
		}
		else if(a > b && a < c || a < b && b < c) {
			System.out.println("The Highest Value is = "+c);
		}
		else if(b > c && b < a || b < c && c < a) {
			System.out.println("The Highest Value is = "+a);
		}
		else if(c > a && c < b || c < a && a < b) {
			System.out.println("The Highest Value is "+b);
		}
		else {
			System.out.println("All Values are Equal");
		}
	}
	public static void main(String args[]) {
		P1 o = new P1();
		o.val();
		o.high();
	}
}

