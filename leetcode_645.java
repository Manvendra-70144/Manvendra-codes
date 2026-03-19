public class leetcode_645 {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4};
        int [] result = set_Mismatch(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] set_Mismatch(int [] nums){

        boolean [] temp = new boolean[nums.length+1];
        int [] result = new int[2];
        for (int i : nums) {
            if(temp[i] == true){
                result[0] = i;
            }else{
                temp[i] = true;
            }
        }

        for(int i=1; i<temp.length; i++){
            if(temp[i]== false) result[1] = i;
        }

        return result;

    }
    
}
