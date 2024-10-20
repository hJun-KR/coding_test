import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] str = new String[n];
        int x = 0;
        
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        
        for (int i = 0; i < n; i++) {
            if (str[i].contains("S")) {
                x = i;
            }
        }
        
        System.out.println(str[x]);
        
    }
}