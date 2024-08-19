import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        h = h-9;
        h = h*60;
        
        System.out.println(h+m);
        
    }
}