import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[2];
        
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        
        System.out.println(a[0] > a[1] ? a[1] : a[0]);
        
    }
}