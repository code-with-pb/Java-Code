import java.util.*;

public class P3 {
	int a;
	void val() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		a = sc.nextInt();
	}
	void show() {
		if(a < 0) {
			System.out.println("No is -ve : "+a);
		}
		else {
			System.out.println("No is +ve: "+a);
		}
	}
	public static void main(String args[]) {
		P3 o = new P3();
		o.val();
		o.show();
	}
}
