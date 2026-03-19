import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_438 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(find_all_anagrams_in_string(s, p));
    }

    public static List<Integer> find_all_anagrams_in_string(String s, String p) {

        char[] pFreq = p.toCharArray();
        sort_String(pFreq);
        char[] sFreq = new char[3];
        List<Integer> list = new ArrayList<>();

        if (s.length() < p.length())
            return list;

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String substr = subString(i, i + p.length(), s);
            sFreq = substr.toCharArray();
            sort_String(sFreq);
            if (Arrays.equals(pFreq, sFreq))
                list.add(i);
            else
                Arrays.fill(sFreq, '\0');
        }
        return list;
    }

    public static String subString(int s, int e, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = s; i < e; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void sort_String(char[] str) {

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {

                if (str[i] > str[j]) {
                    char temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
    }

}
