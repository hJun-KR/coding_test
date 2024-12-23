class Solution {
    public int solution(int a, int b) {
        String str = a + "" + b;
        int answer = Integer.parseInt(str);
        if (2 * a * b > answer) answer = 2 * a * b;
        return answer;
    }
}