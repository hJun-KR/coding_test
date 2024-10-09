import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int j = 1;
		while(n != 0) {
			for(int i = 0; i < n; i++) {
				int a = sc.nextInt();
			}
			System.out.println("Case " + j + ": Sorting... done!");
			j++;
			n = sc.nextInt();
		}

	}
}