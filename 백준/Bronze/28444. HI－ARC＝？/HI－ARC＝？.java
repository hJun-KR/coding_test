import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        
        num[0] = num[0]*num[1];
        num[2] = num[2]*num[3]*num[4];
        num[1] = num[0]-num[2];
                         
        System.out.println(num[1]);
        
    }
}