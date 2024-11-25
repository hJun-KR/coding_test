class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int last = num_list[num_list.length-1];
        int milast = num_list[num_list.length-2];
        
        int result = 0;
        
        if (last > milast) {
            result = (last-milast);
        } else {
            result = (last*2);
        }
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        answer[num_list.length] = result;
        
        return answer;
    }
}