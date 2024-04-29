import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            
        }
        for (int i = 0; i < a.length; i++) {
            b += a[i]*a[i];
        }
        b %= 10;
        System.out.println(b);
    }
}
