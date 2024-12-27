class Solution {
    static int sum;
    public int solution(int n) {
        findDivisor(n, 1);
        return sum;
    }
    private static void findDivisor(int num, int i) {
        if(i > num) {
            return;
        }

        if(num % i == 0) {
            sum += i;   
        }

        findDivisor(num, i+1);
    }
}