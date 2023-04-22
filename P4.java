import java.util.*;

public class P4 {
	int a;
	void val() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		a = sc.nextInt();
	}
	void show() {
		if(a % 5 == 0 && a % 11 == 0) {
			System.out.println(a+" is divisable by 5 and 11");
		}
		else if(a % 5 == 0 && a % 11 != 0){
			System.out.println(a+" is divisable by 5 but not by 11");
		}
		else if(a % 5 != 0 && a % 11 == 0) {
			System.out.println(a+" is not divisable by 5 but it divsable by 11");
		}
		else {
			System.out.println(a+" is not divisable by 5 and 11");
		}
	}
	public static void main(String args[]) {
		P4 o = new P4();
		o.val();
		o.show();
	}
}
