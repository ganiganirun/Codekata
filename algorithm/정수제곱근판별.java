import java.lang.Math;

class Solution {
    public long solution(long n) {
        double a = Math.sqrt(n);
        long answer = 0;
        if(a % 1 == 0){
            a = a + 1;
            answer = (long) Math.pow(a, 2);
        }else{
            answer = -1;
        }


        return answer;
    }
}