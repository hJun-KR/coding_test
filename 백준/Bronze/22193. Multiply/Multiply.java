import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();
        
        System.out.println(c.multiply(d));
        
    }
}