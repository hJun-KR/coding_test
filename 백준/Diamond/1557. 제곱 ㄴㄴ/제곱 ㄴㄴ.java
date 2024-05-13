import java.util.Scanner;

public class Main {
    static final int MX = 100000;
    static int[] mobius = new int[MX + 1];
    
    // N 이하의 square free number의 수
    static long solve(long N){
        long ret = 0;
        for(int i = 1; i * i <= N; i++) ret += mobius[i] * (N / (i * i));
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        for (int i = 1; i <= MX; i++) mobius[i] = 1;
        for (int i = 2; i * i <= MX; i++) {
            if (mobius[i] == 1) {
                for (int j = i; j <= MX; j += i) mobius[j] *= -i;
                for (int j = i * i; j <= MX; j += i * i) mobius[j] = 0;
            }
        }
        for (int i = 2; i <= MX; i++) {
            if (mobius[i] == i) mobius[i] = 1;
            else if (mobius[i] == -i) mobius[i] = -1;
            else if (mobius[i] < 0) mobius[i] = 1;
            else if (mobius[i] > 0) mobius[i] = -1;
        }
        long st = 1;
        long en = 2000000000;
        while (st < en) {
            long mid = (st + en) / 2;
            long val = solve(mid);
            if (val > K) en = mid - 1;
            else if (val == K) en = mid;
            else st = mid + 1;
        }
        System.out.println(st);
    }
}