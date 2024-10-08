import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sleep = sc.nextInt();
        int wakeUp = sc.nextInt();
        
		if (20 <= sleep && sleep <= 23) {
			System.out.println(24 - sleep + wakeUp);
		} else {
			System.out.println(wakeUp - sleep);
		}
        
    }
}