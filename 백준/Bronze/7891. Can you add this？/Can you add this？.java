import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            
            System.out.println(a.add(b));
            
        }
        
    }
}