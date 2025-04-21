class Solution {
    public int[] solution(long n) {
        String k = n+"";

        int[] answer = new int[k.length()];
        for(int i = 0; i < k.length() ; i++){

            answer[i] = (int)(n % 10);
            n = n /10;
        }
        return answer;
    }
}