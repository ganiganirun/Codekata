class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double dnum1 = num1;
        answer = (int)((dnum1/num2) * 1000);
        return answer;
    }
}