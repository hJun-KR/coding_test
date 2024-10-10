import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int excludedCount = 0;
        
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            if (d % 2 != 0) {
                excludedCount++;
            }
        }
        
        System.out.println(excludedCount);
    }
}
