import java.util.HashSet;

public class leetcode_771 {
    public static void main(String[] args) {
        String jewels = "a", stones = "aAAbbbb";
        System.out.println(jewels_Stones_Count(jewels, stones));
    }

    public static int jewels_Stones_Count(String jewels, String stones){

        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<jewels.length(); i++){
            set.add(jewels.charAt(i));
        }

        int count=0;
        for(int i=0; i<stones.length(); i++){
            if(set.contains(stones.charAt(i))) count++;
        }

        return count;
    }
}
