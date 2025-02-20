class Solution {
    public int solution(int n) {
        
        int i = 0;
        int sum = 0;
        
        while(i<=n){
            
            if(i > 0 && i % 2 == 0){
                sum = sum + i;
            }
            
            i++;
        }
        
        int answer = sum;
        return answer;
    }
}