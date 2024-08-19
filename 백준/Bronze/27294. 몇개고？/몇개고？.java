import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int al = sc.nextInt();
        
        if (al == 1) {
            System.out.println(280);
        } else if (h >= 12 && h <= 16) {
            System.out.println(320);
        } else {
            System.out.println(280);
        }
        
        
    }
}