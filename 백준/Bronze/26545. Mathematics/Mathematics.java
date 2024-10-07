import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int repeat = sc.nextInt();
        int sum = 0;
        
        for (int i = 0; i < repeat; i++) {
            int n = sc.nextInt();
            
            sum += n;
        }
        System.out.println(sum);
        
    }
}