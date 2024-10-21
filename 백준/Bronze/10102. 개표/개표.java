import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String str = sc.next();
        
        int acnt = 0;
        int bcnt = 0;
        
        for (int i = 0; i < N; i++) {
            char ch = str.charAt(i);
            
            if (ch == 'A') {
                acnt++;
            } else if (ch == 'B') {
                bcnt++;
            }
        }
        
        if (acnt > bcnt) {
            System.out.println('A');
        } else if (acnt < bcnt) {
            System.out.println('B');
        } else {
            System.out.println("Tie");
        }
        
        
        
    }
}