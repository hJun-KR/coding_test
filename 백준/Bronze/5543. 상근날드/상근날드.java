import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int sang = sc.nextInt();
        int joong = sc.nextInt();
        int ha = sc.nextInt();
        int coke = sc.nextInt();
        int sprite = sc.nextInt();

        int set1 = sang + coke - 50;
        int set2 = joong + coke - 50;
        int set3 = ha + coke - 50;
        int set4 = sang + sprite - 50;
        int set5 = joong + sprite - 50;
        int set6 = ha + sprite - 50;
        
        int[] arr = {set1, set2, set3, set4, set5, set6};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);

    }
}