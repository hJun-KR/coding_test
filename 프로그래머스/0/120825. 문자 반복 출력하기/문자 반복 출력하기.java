class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                char ch = my_string.charAt(i);
                answer += ch;
            }
        }
        
        return answer;
    }
}