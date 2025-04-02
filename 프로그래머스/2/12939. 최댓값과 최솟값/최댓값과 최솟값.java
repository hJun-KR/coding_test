class Solution {
    public static String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            if (min > intArr[i]) {
                min = intArr[i];
            }
        }

        answer = min + " " + max;

        return answer;
    }
}