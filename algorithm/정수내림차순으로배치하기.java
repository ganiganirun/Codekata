import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = n+"";
        Long[] arr = new Long[a.length()];

        for(int i = 0; i < a.length(); i++){
            arr[i] = n % 10;
            n = n / 10;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        answer = arr[0];

        for(int i = 1; i< a.length(); i++){
            answer = (answer*10) + arr[i];
        }

        return answer;
    }
}