import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        double[] arr2 = new double[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < a; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < a; i++) {
            arr2[i] = ((double)arr[i]/(double)max)*100;
        }

        double sum = 0.0;
        for (int i = 0; i < a; i++) {
            sum += arr2[i];
        }
        
        double avg = (double)sum/a;

        System.out.println(avg);

    }
}