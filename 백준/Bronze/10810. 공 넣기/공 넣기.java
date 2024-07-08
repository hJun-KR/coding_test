import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt()+1;
        int b = sc.nextInt()+1;

        int[] arr = new int[a];


        for (int i = 1; i < b; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            for (int j = c; j < d+1; j++) {
                arr[j] = e;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}