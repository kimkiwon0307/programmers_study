class Solution {
    public double solution(int[] arr) {
        
        int sum =0;
        
        int size = arr.length;
        
        for(int i=0 ; i < size; i ++){
            
         sum += arr[i];
    
        }    
    
        double answer = (double) sum / size;
        return answer;
    }
}