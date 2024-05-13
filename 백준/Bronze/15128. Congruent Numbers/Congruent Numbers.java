import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double p1 = sc.nextDouble();
		double q1 = sc.nextDouble();
		double p2 = sc.nextDouble();
		double q2 = sc.nextDouble();
		
		if((p1 * p2) % (q1 * q2 * 2) == 0){
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		sc.close();
	}
}