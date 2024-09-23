import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt() + 1;
        int n2 = sc.nextInt() + 1;
        int n3 = sc.nextInt() + 1;
        
        int total = (((n1 * n2) / n3)-1);
        
        System.out.println(total);
        
    }
}