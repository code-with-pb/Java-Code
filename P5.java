import java.util.*;

public class P5 {
	int yr;
	void Yr() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: ");
		yr = sc.nextInt();
	}
	void show() {
		if(((yr % 4 == 0) && (yr % 100 != 0)) || (yr % 400 == 0)) {
			System.out.println(yr+" This is leap year");
		}
		else {
			System.out.println(yr+" This is not leap year");
		}
	}
	public static void main(String args[]) {
		P5 o = new P5();
		o.Yr();
		o.show();
	}
}
