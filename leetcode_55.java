public class leetcode_55 {

    public static void main(String[] args) {
        int [] arr = {2,3,1,1,4};
        System.out.println("Jump Game Result => "+jump_Game_I(arr));
    }

    public static boolean jump_Game_I(int [] nums){
        int final_postion = nums.length-1;
        for(int i=nums.length-2; i>=0; i--){
            if(i + nums[i] >= final_postion){
                final_postion = i;
            }
        }
        return final_postion == 0;
    }
}