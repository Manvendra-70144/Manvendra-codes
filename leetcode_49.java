import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode_49 {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(group_Anagrams(strs));
    }

    public static List<List<String>> group_Anagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String sortedStr = sort(s);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static String sort(String str) {
        char [] s = str.toCharArray();
        for (int i = 0; i < s.length-1; i++) {
            for (int j = 0; j < s.length-1; j++) {
                if(s[j] > s[j+1]){
                    char ch = s[j];
                    s[j] = s[j+1];
                    s[j+1] = ch;
                }
            }
        }
        return new String(s);
    }

}
