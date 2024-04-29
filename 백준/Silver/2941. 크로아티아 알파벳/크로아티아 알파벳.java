import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while (true) {
            if (str.contains("c=")) {
            str = str.replaceAll("c=", " ");
            }
            if (str.contains("c-")) {
                str = str.replaceAll("c-", " ");
            }
            if (str.contains("dz=")) {
                str = str.replaceAll("dz=", " ");
            }
            if (str.contains("d-")) {
                str = str.replaceAll("d-", " ");
            }
            if (str.contains("lj")) {
                str = str.replaceAll("lj", " ");
            }
            if (str.contains("nj")) {
                str = str.replaceAll("nj", " ");
            }
            if (str.contains("s=")) {
                str = str.replaceAll("s=", " ");
            }
            if (str.contains("z=")) {
                str = str.replaceAll("z=", " ");
            } else {
                break;
            }
        }
        
        System.out.println(str.length());
    }
}
