class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        boolean okay = (a - b <= 0) ? true : false; 
        if (okay) {
            for (int i = a; i <= b; i++) answer += i;
        } else { 
            for (int i = a; i >= b; i--) answer += i;
        }
        System.out.print(answer);
        return answer;
    }
}