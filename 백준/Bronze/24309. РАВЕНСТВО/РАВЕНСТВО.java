import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        
        BigInteger d = b.subtract(c);
        BigInteger answer  = d.divide(a);
        
        System.out.println(answer);
        
    }
}
