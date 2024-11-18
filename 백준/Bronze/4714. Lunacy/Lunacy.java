import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double weightOnEarth = 0; 

        while (true) { 
            weightOnEarth = sc.nextDouble();
            if (weightOnEarth < 0) {
                break;
            }
            double weightOnMoon = weightOnEarth * 0.167; 

            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", weightOnEarth, weightOnMoon);
        }
    }
}