import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
        int n = 0;
        
		for(int i = 0; i < ( N * 2 - 1); i++) {
			int b = N;
			if(i < N) {
				b = b - i;
			} else {
				b = (i - N + 2);
			}
			n = ( 2 * b) - 1;
			for(int j = 0; j < N - b; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}	
		System.out.println();	
		}
	}
}