import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger c = a.add(b);
        BigInteger d = a.subtract(b);
        BigInteger e = a.multiply(b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}