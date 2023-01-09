// Given a string S and a number K, find the number of substrings of length K such that each character in the substring is present only once.
package String;
import java.util.*;
public class SubWith_KId {
    
    public static  int substring(String str,int k) {
        if(str.length()<k){
            return 0;
        }
        int result =  0;
        Set<Character> chars = new HashSet<>();
        int left = 0;
        for(int right = 0;right<str.length();right++){
            char c = str.charAt(right);
            while(chars.contains(c)|| right-left+1>k){
                chars.remove(str.charAt(left));
                left++;
            }
            chars.add(c);
            if(right-left+1==k){
                ++result;
            }
        }
        return result;
    }
    // public static void main(String[] args) {
        
    //     String str = "aadbbghj";
    //     int k  = 2;
    //     System.out.println(substring(str, k));
    // }
    public static void main(String[]args){
        String str = "sdjaldacnlas";
        int n = 2;
        int count = 0;
        int j =0;
        while(n<=str.length()){
            String s = "";
            for(int k=j;k<n;k++){
                s = s+str.charAt(k);
            }
            boolean flag = true;
            HashMap<Character,Integer> hm = new HashMap<>();
            for(int k =0;k<s.length();k++){
              if(hm.containsKey(s.charAt(k))){
                  flag = false;
                  break;
              }else{
                  hm.put(s.charAt(k),1);
              } 
            
            }
            if(flag){
                count++;
            }
            j++;
            n++;
        }
        System.out.println(count);
        }
}
