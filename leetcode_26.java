public class leetcode_26 {
    public static void main(String[] args) {
        int [] arr = {1,1,2};
        int result = remove_Duplicates(arr);
        System.out.println("here is the result "+result);
    }

    public static int remove_Duplicates(int [] nums){            

        int j=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
     
}
