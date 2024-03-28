class Solution {
    public String solution(String s) {
       
        
        int max = 0;
		int z = 0;

		String [] b = s.split(" ");
		
		int min = Integer.parseInt(b[0]);
		int cho = Integer.parseInt(b[0]);
		
        for (int i = 0; i < b.length; i++) {
			
			int k = Integer.parseInt(b[i]);
            
            // 최대값
			if(k>=cho) {
				max = k;
				cho = k;
			}
			
            //최소값
			if (min > k) {	
				min = k;
			}

		}
        
        String answer = min + "" + " " +max + "";
        
        return answer;
    }
}