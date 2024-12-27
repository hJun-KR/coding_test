import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        boolean[] have = new boolean[10];
        int[] num = new int[10];
        
        for (int i = 1; i <= 9; i++) {
            num[i] = i;
        }
        
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            have[numbers[i]] = true;
        }
        
        for (int i = 0; i < num.length; i++) {
            answer += have[i] ? 0 : num[i];
        }
        
        return answer;
    }
}