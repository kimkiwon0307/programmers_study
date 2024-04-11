class Solution {
    public int solution(int[] num_list, int n) {
        
        int answer = 0;
        
        
          for(int i =0; i < num_list.length; i++){
            int[] num =  new int[num_list.length];
            num[i] = num_list[i];

            if (num[i] == n){
                answer = 1;
            }


        }
        
        
        
        
        
        return answer;
    }
}