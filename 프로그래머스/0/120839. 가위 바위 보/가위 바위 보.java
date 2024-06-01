import java.util.*;
class Solution {
    public String solution(String rsp) {
        
        List<Character> list = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        
        for(int i=0; i<rsp.length(); i++){
            list.add(rsp.charAt(i));
        }
        
        list.forEach(a -> {
            
            if (a == '2') {
                list2.add('0');
            }else if(a == '0'){
                list2.add('5');
            }else if (a == '5'){
                list2.add('2');
            };
             
        });
        
        
        String answer = "";
        
        for(int i=0; i<list2.size(); i++){
            
            answer += list2.get(i)+"";
        }
        
        return answer;
    }
}