import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int D = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        int time = ((D - 11) * 60 * 24) + ((H - 11) * 60) + (M - 11);
        System.out.println((time >= 0) ? time : -1);
        
    }
}