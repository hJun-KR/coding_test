class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String str = my_string;
        int length = str.length();
        
        
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch >= '1' && ch <= '9') {
                answer += ch-'0';
            }
            
        }
        
        
        return answer;
    }
}