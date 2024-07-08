import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        int b = a.length();

        int[] arr = { 1, 0, 0};
        int index = 0;

        for (int i = 0; i < b; i++) {
            if(a.charAt(i) == 'A') {
                int temp = arr[1];
                arr[1] = arr[0];
                arr[0] = temp;
            }
            else if(a.charAt(i) == 'B') {
                int temp = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;
            }
            else if(a.charAt(i) == 'C') {
                int temp = arr[0];
                arr[0] = arr[2];
                arr[2] = temp;
            }
        }

        for (int i = 0; i < 3; i++) {
            if(arr[i] == 1) {
                index = i;
            }
        }

        System.out.println(index+1);


    }
}