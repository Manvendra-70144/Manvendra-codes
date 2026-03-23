import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode_139 {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet","code"); 
        System.out.println(word_break(s,wordDict, new HashMap<>()));
    }

    public static boolean word_break(String s, List<String> wordDict, Map<String,Boolean> map){

        if(map.containsKey(s)) return map.get(s);
        if(s.length() == 0) return true;

        for(int i=0; i<=s.length(); i++){
            String prefix = subString(0, i, s);

            if(wordDict.contains(prefix)){
                String remaining = subString(i, s.length(), s);

                if (word_break(remaining, wordDict, map)) {
                    map.put(remaining,true);
                    return true;
                }
            }
        }
        map.put(s,false);
        return false;
    }


    public static String  subString(int start, int end, String s){
        StringBuilder sb = new StringBuilder();
        while (start < end) {
            sb.append(s.charAt(start));
            start++;
        }
        return sb.toString();
    }
    
}
