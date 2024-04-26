import java.util.*;

public class Main {
    public static void main ( String[] args ){
        Scanner sc = new Scanner(System.in);
        int h, m, nh, nm, c, nc, nnh;
        h = sc.nextInt();
        m = sc.nextInt();
        c = sc.nextInt();

        nh = h;
        nm = m+0;

        nc = c/60;
        nh += nc;
        nc = c%60;
        nm += nc;

        if (nm >= 60) {
            nh += nm/60;
            nm = nm%60;
        }
        if (nm < 0) {
            nh -= 1;
            nm += 60;
        }
        if (nh < 0) {
            nh = 23;
        }
        nnh = nh;
        if (nh >= 24) {
            nh = 0;
            nh += nnh%24;
        }



        System.out.println(nh + " " + nm);
    }
}
