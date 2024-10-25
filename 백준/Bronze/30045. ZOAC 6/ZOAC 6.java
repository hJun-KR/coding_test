import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String[] str = new String[N];
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
        }
        
        for (int i = 0; i < N; i++) {
            if (str[i].contains("01") || str[i].contains("OI")) {
                count++;
            }
        }
        System.out.println(count);
        
    }
}