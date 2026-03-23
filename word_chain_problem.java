import java.util.*;

// manual way 
public class word_chain_problem {
    public static void main(String[] args) {
        String[] words = { "apple", "lemon", "onion", "onward", "jira" };

        int count = buildChainCount(words);
        System.out.println("Count = " + count);
    }

    public static int buildChainCount(String[] words) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : words) {
            String prefix = s.substring(0, 2);
            map.putIfAbsent(prefix, new ArrayList<>());
            map.get(prefix).add(s);
        }
        System.out.println(map);

        Set<String> used = new HashSet<>();
        String current = words[0];
        used.add(current);
        int count = 0;
        while (true) {
            String suffix = current.substring(current.length() - 2);
            if (!map.containsKey(suffix)) {
                break;
            }
            boolean found = false;
            for (String next : map.get(suffix)) {
                if (!used.contains(next)) {
                    count++;
                    used.add(next);
                    current = next;
                    found = true;
                    break;
                }
            }
            if (!found)break;
        }
        return count;
    }
}