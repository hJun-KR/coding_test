import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double met = 4.0;
        double turn = sc.nextDouble();
        
        System.out.printf("%.2f", turn/met);
        
    }
} 