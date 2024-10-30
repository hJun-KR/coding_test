import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();

        double length = Math.sqrt((double) D*D / (H*H + W*W));
        
        System.out.println((int) Math.floor(length*H) + " " + (int) Math.floor(length*W));
    }
}
