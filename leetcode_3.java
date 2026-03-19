import java.util.HashSet;

public class leetcode_3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(longest_Repeating_Substring_Without_Repeating_Char(s));
    }
    public static int longest_Repeating_Substring_Without_Repeating_Char(String s){

        HashSet<Character> set = new HashSet<>();
        int j=0, maxlen=0;
        for(int i=0; i<s.length(); i++){
            
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }

            set.add(s.charAt(i));
            maxlen = Math.max(maxlen, i-j+1);
        }
        return maxlen;
    }
}
