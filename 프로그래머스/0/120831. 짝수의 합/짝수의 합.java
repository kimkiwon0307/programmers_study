class Solution {
    public int solution(int n) {
       
        int sum = 0;
        
        for(int i=0; i<=n; i++){
            
            if(i % 2 == 0){
                sum += i;
            }
            
        }
        
        
        int answer = sum;
        return answer;
    }
}