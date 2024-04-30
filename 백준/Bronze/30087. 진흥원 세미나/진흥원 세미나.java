import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b;
        for (int i = 0; i <= a; i++) {
            b = sc.nextLine();
            if (b.equals("Algorithm")) {
                System.out.println(204);
            } else if (b.equals("DataAnalysis")) {
                System.out.println(207);
            } else if (b.equals("ArtificialIntelligence")) {
                System.out.println(302);
            } else if (b.equals("CyberSecurity")) {
                System.out.println("B101");
            } else if (b.equals("Network")) {
                System.out.println(303);
            } else if (b.equals("Startup")) {
                System.out.println(501);
            } else if (b.equals("TestStrategy")) {
                System.out.println(105);
            }
        }
    }
}