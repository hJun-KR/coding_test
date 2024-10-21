import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int jcnt = 1;
        int jcnt2 = 1;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = n-jcnt2; j > 0; j--) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < jcnt; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            
            jcnt2++;
            jcnt+=2;
        }
        
    }
} 

