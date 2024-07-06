import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int b = sc.nextInt();
        int[] a = new int[b*2];
        int j = 1;

        int chang = 100;
        int sang = 100;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i+=2) {
            if(a[i] == a[j]) {

            }
            else if (a[i] < a[j]) {
                chang = chang - a[j];
            }
            else if (a[i] > a[j]){
                sang = sang - a[i];
            }

            if (j < a.length) {
                j+=2;
            }
        }

        System.out.println(chang + " " + sang);


    }
}
