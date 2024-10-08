import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s1 = sc.nextInt() * 2;
        int s2 = sc.nextInt();
        
        if (s1 >= s2) {
            System.out.println("E");
        } else {
            System.out.println("H");
        }
        
    }
}