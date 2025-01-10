import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        if (x % 3 == 0) {
            System.out.println("S");
        } else if (x % 3 == 1) {
            System.out.println("U");
        } else {
            System.out.println("O");
        }
    }
}