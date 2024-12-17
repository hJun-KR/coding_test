class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int index = 0;
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]) { 
                max = sides[i];
                index = i;
            }
        }
        
        for (int i = 0; i < sides.length; i++) {
            if (index == i) { 
                continue;
            }
            answer += sides[i];
        }
        return (answer > max) ? 1 : 2;
    }
}