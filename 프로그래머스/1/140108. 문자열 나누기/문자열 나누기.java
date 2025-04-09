class Solution {
        public int solution(String s) {
        int answer = 0;

        char x = s.charAt(0);
        int countX = 1;
        int countY = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                countX++;
            } else {
                countY++;
            }
            if (countX == countY) {
                answer++;
                if (i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                    countX = 1;
                    countY = 0;
                    i++;
                }
            }
        }
        if (countX != countY) {
            answer++;
        }


        return answer;
    }
}