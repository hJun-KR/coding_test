import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] scores = new int[10];
        int scoreA = 0;
        int scoreB = 0;
        
        for(int i = 0; i < 10; i++) {
        	scores[i] = sc.nextInt();
        }
        
        scoreA = scores[0] * 6 + scores[1] * 3 + scores[2] * 2 + scores[3] * 1 + scores[4] * 2;
        scoreB = scores[5] * 6 + scores[6] * 3 + scores[7] * 2 + scores[8] * 1 + scores[9] * 2;
        
        System.out.println(scoreA + " " + scoreB);
        
    }
}