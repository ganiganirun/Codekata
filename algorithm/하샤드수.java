import java.lang.Math;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int a = 0;
        int xx = x;
        String xnum = x+"";
        for(int i = xnum.length(); i>1; i--){
            a += xx / (int)Math.pow(10, (i-1));
            xx = xx % (int)Math.pow(10, (i-1));
        }
        a = a + xx;
        System.out.print(a);
        if(x % a == 0){
            answer = true;
        }
        return answer;
    }
}