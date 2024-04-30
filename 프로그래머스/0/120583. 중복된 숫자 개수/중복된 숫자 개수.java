class Solution {
    public int solution(int[] arrays, int n) {
      	int i = 0;
			int amount = 0;
			for(int array : arrays){

				if(array == n){
					amount += 1;
				}
			}
        
        int answer = amount;
        return answer;
    }
}