import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int repeat = sc.nextInt();
        
        for (int i = 0; i < repeat; i++) {
            int N = sc.nextInt();
            
            System.out.println(N + " " + N);
        }
        
    }
}