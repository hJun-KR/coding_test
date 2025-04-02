class Solution {
    public static int[] solution(long n) {
        int length = (int)(Math.log10(n) + 1); 
        int[] answer = new int[length];
        long[] temp = new long[length];

        for (int i = 0; i < length; i++) {
            temp[i] = n % 10;
            n /= 10;
        }
        for (int i = 0; i < temp.length; i++) {
            answer[i] = (int)temp[i];
        }
        
        return answer;
    }
}