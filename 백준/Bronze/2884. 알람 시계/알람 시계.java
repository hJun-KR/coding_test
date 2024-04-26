import java.util.*;

public class Main {
    public static void main ( String[] args ){
        Scanner sc = new Scanner(System.in);
        int h, m, nh, nm;
        h = sc.nextInt();
        m = sc.nextInt();

        nh = h;
        nm = (m - 45);

        if (nm < 0) {
            nh -= 1;
            nm += 60;
        }
        if (nh < 0) {
            nh = 23;
        }
        System.out.println(nh + " " +nm);
    }
}
