public class leetcode_88 {

    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge_sorted_arrays(nums1,m,nums2,n);
    }
    
    public static void merge_sorted_arrays(int [] nums1, int m, int [] nums2, int n){
     
        int r1 = m-1;
        int r2 = n-1;
        int w = m+n-1;
        while (w >=0) {
            if(r1 >= 0 && r2 >=0){
                nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
            }else if(r1 >= 0){
                nums1[w] = nums1[r1--];
            }else{
                nums1[w] = nums2[r2--];
            }
            w--;
        }

        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }
}