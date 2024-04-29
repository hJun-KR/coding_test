import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        sc.close();

        long tot = a * b * c;

        int[] count = new int[10];

        while (tot > 0) {
            int digit = (int)(tot % 10);
            count[digit]++;
            tot /= 10; 
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}

