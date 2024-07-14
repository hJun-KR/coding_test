import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr;
        double[] avg = new double[a];

        for (int i = 0; i < a; i++) {
            int sum = 0;
            int b = sc.nextInt();
            arr = new int[b];

            for (int j = 0; j < b; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            avg[i] = (double)sum / (double)b;

            double count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > avg[i]) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count / b) * 100);
        }


    }
}