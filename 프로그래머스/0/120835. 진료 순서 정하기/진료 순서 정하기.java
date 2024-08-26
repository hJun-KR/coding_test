class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] num = new int[length];
        
        for (int i = 0; i < length; i++) {
            num[i] = 1;
        }
        
        for (int i = 0; i < length-1; i++) {
            for (int j = i; j < length; j++) {
                if (emergency[j] > emergency[i]) {
                    num[i]++;
                } else if (emergency[i] > emergency[j]) {
                    num[j]++;
                }
            }
        }
        
        
        int[] answer = num;
        
        
        
        return answer;
    }
}