import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean check = false;
        int[] a = new int[8];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            
            if (a[i] == 9) {
                check = true;
            }
            
        }
        
        if (check) {
            System.out.println("F");
        } else {
            System.out.println("S");
        }
        
    }
}