class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        while (true) {
            if (money - 5500 < 0) {
                answer[1] = money;
                break;
            }
            money -= 5500;
            answer[0]++;
            
        }
        return answer;
    }
}