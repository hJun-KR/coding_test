import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            BigInteger a = sc.nextBigInteger();
            if (a.equals(BigInteger.ZERO)) {
                break;
            }
            BigInteger b = new BigInteger("42");

            if(a.mod(b).equals(BigInteger.ZERO)){
                System.out.println("PREMIADO");
            }
            else {
                System.out.println("TENTE NOVAMENTE");
            }
    }
        
    }
}