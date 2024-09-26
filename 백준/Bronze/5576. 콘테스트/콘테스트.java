import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        int sum1 = 0;
        int sum2 = 0;
        
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = sc.nextInt();
        }
        
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for (int i = 7; i < 10; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        
        System.out.println(sum1 + " " + sum2);
        
    }
}