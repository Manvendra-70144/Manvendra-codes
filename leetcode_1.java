import java.util.HashMap;
import java.util.Map;

public class leetcode_1 {
    public static void main(String[] args) {
        int [] nums = {2,14,11,71};
        int target = 9;
        int [] result = Two_sum(nums, target);
        System.out.println(result[0] +" "+result[1]);
    }

    public static int [] Two_sum(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
