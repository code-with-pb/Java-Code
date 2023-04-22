import java.util.Scanner;

public class P2 {
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
		if(a > b) {
			if(a > c) {
				System.out.println("The Heighest Value is ="+a);
			}
			else {
				System.out.println("The Heighest Value is = "+c);
			}
		}
		
		else {
			if(b > c) {
				System.out.println("The Heighest Value is = "+b);
			}
			else {
				System.out.println("The Heighset Value is = "+c);
			}
		}
	}
	public static void main(String args[]) {
		P1 o = new P1();
		o.val();
		o.high();
	}
}

