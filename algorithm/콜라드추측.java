class Solution {
    public int solution(int num) {
        int answer = 0;
        long num1 = (long) num;
        boolean flag = true;
        if (num1 == 1){
            flag = false;
        }
        while(flag){
            if (num1 % 2 == 0){
                num1 = num1 / 2;
                answer ++;
            }else if(num1 % 2 == 1){
                num1 = num1 * 3 + 1;
                answer++;
            }

            if(answer >= 500){
                answer = -1;
                flag = false;
            }

            if(num1 == 1){
                flag = false;
            }


        }

        return answer;
    }
}