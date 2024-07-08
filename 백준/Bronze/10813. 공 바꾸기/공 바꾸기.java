import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt()+1;
        int b = sc.nextInt()+1;

        int[] arr = new int[a];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 1; i < b; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            int temp = arr[c];
            arr[c] = arr[d];
            arr[d] = temp;
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}