import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[8];

        for (int i = 0; i < 8; i++) {
            a[i] = sc.nextInt();
        }

        if(a[0] == 1 && a[1] == 2 && a[2] == 3 && a[3] == 4 && a[4] == 5 && a[5] == 6 && a[6] == 7 && a[7] == 8) {
            System.out.println("ascending");
        }
        else if (a[0] == 8 && a[1] == 7 && a[2] == 6 && a[3] == 5 && a[4] == 4 && a[5] == 3 && a[6] == 2 && a[7] == 1) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }

    }
}
