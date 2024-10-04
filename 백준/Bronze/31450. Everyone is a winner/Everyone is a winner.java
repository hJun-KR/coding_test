import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        if (m % k == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}