import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int ten = N / 10;
        int one = N % 10;
        
        if (ten == one) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
    }
}