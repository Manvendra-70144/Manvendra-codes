public class leetcode_125 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println("Valid Palindrome => " + valid_Palindrome(str));
    }

    public static boolean valid_Palindrome(String s){

        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
        int left =0;
        int right = str.length()-1;
        while (left < right) {
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }           
            else{
                return false;
            } 
        }
        return true;
    }
}
