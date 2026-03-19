public class String_compression {
    public static void main(String[] args) {
        String s = "aaabbbcccceef";
        string_compression(s);
    }

    public static void string_compression(String s){

        int j=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i); // a
            System.out.println(ch);
            while (j < s.length() && ch == s.charAt(j)) {
                j++;
            }
            int len = j-i;
            sb.append(ch);
            if(len>1){
                sb.append(len);
            }
            i = j-1;
        }
        System.out.println(sb.toString());
    }
    
}
