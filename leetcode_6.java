public class leetcode_6 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(zig_zag_Pattern(s,numRows));
    }

    public static String zig_zag_Pattern(String s, int numRows){

        StringBuilder [] rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i] = new StringBuilder();
        }
        int currentRow =0;
        boolean goingDown = false;
        for(char ch : s.toCharArray()){
            rows[currentRow].append(ch);
            if(currentRow == 0 || currentRow == numRows-1) goingDown = !goingDown;
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder content : rows) {
            sb.append(content);
        }        
        return sb.toString();
    }
}
