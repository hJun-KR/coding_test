import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long[] arr = new long[6];
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        int clo = sc.nextInt();
        int pen = sc.nextInt();

        while(cnt != 6) {
            if (arr[cnt] == 0) {

            } 
            else {
                if(arr[cnt]/clo == 0) {
                    sum++;
                } else {
                    if (arr[cnt] % clo == 0) {
                        sum += arr[cnt]/clo;
                    }
                    else {
                        sum += arr[cnt]/clo + 1;
                    }
               }
            }

            cnt++;
        }

        System.out.println(sum);
        System.out.println(n/pen + " " + n%pen);


    }
}