import java.util.HashSet;

public class leetcode_266_P {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(palindrome_Permutation(str));
    }

    public static boolean palindrome_Permutation(String s){

        String str = s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
        HashSet<Character> ch = new HashSet<>();
        
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(ch.contains(c)){
                ch.remove(c);
            }else{
                ch.add(c);
            }
        }
        return ch.size() <= 1;
    }
}
