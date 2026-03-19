public class leetcode_11 {
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        int result = container_with_most_water(height);
        System.out.println(result);
    }

    public static int container_with_most_water(int [] height){
        

        int right= height.length-1;
        int left = 0;
        int ans =0;
        while (left<right) {
            int area = Math.min(height[left], height[right]) * (right-left);
            ans = Math.max(ans, area);
            if(height[right] > height[left]) left++;
            else right--;
        }
        return ans;
    }
}
