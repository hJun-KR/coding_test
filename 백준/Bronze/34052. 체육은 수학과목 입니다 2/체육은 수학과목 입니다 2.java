import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        final int total = 1500;
        int lap1 = sc.nextInt();
        int lap2 = sc.nextInt();
        int lap3 = sc.nextInt();
        int lap4 = sc.nextInt();
        
        int tot = lap1 + lap2 + lap3 + lap4;
        
        if (total < tot) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
    }
}