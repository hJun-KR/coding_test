class Solution {
    public int solution(int n, int k) {
        final int sheep = 12000;
        final int drink = 2000;
        int minus = (sheep*n) / 120000;
        int answer = 0;
        
        answer = (sheep * n) + (drink * k) - (drink * minus);
        
        return answer;
    }
}