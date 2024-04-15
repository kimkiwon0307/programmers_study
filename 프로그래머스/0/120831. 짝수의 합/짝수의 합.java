class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        
        for (int i = 0; i <= n; i ++){
            
            if(i == n){
                
                for(int j = 0; j<= i; j++){
                    
                    if(j % 2 == 0){
                        answer += j;
                    }
                    
                }
                
                
            }
            
            
            
        }
        
        
        return answer;
    }
}