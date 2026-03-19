public class leetcode_80 {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,1,2,3,3};
        int result = remove_Duplicates_with_twice_values(arr);
        System.out.println(result);
    }

    public static int remove_Duplicates_with_twice_values(int [] nums){
        
        int i=0;
        for(int n : nums){
            if(i<2 || n != nums[i-2]){
                nums[i++] = n;
            }
        }
        return i;
    }
}
