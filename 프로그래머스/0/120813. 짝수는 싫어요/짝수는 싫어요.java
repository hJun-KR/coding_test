class Solution {
    public int[] solution(int n) {
        int length = (n % 2 == 0) ? (n / 2) : (n / 2 + 1);
        System.out.print(length);
        int[] answer = new int[length];
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer[i/2] = i;
            }
        }
        return answer;
    }
}