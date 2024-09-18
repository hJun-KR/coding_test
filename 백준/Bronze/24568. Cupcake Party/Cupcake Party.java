import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = a*8;
        long d = b*3;
        long e = c+d;
        
        
        System.out.println(e - 28);
        
    }
}