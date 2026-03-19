public class Find_Substring_in_String {
    public static void main(String[] args) {
        String s = "data structures";
        String find = "tures";
        System.out.println(find_substring_in_string(s,find));
    }

    public static int  find_substring_in_string(String s, String find){

        int findLen = find.length();
        for(int i=0; i<=s.length()-findLen; i++){
             if(subStr(i, i + findLen, s).equals(find)){
                return i;
            }
        }
        return -1;
    }

    public static String subStr(int s, int e, String str){
        String subStr = "";
        for(int i=s; i<e; i++){
            subStr+= str.charAt(i);
        }
        System.out.println(subStr);
        return subStr;
    }
}
