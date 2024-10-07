import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int V = N / 5;
        int I = N % 5;
        
        for (int i = 0; i < V; i++) {
            System.out.print("V");
        }
        for (int i = 0; i < I; i++) {
            System.out.print("I");
        }
        
    }
}