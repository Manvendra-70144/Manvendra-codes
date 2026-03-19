public class leetcode_1537 {
    public static void main(String[] args) {
        int [] nums1 = {1,3,5,7,9};
        int [] nums2 = {3,5,100};
        System.out.println(get_Maximum_Score(nums1, nums2));
    }

    public static int get_Maximum_Score(int [] nums1, int [] nums2){

        int i=0, j=0; 
        long Sa=0, Sb=0, ans=0;
        int MOD = 1000000007;
        int n1= nums1.length;
        int n2= nums2.length;
        while (i<n1 && j<n2){
            if(nums1[i] < nums2[j]){
                Sa += nums1[i++];
            } else if(nums2[j] < nums1[i]){
                Sb += nums2[j++];
            }else{
                ans += Math.max(Sa, Sb) + nums1[i];
                Sa=0; Sb=0;
                i++; j++;
            }
        }

        while (i<n1) {Sa += nums1[i++];}
        while (j<n2) {Sb += nums2[j++];}
        ans += Math.max(Sa, Sb);
        return (int)(ans % MOD);
    }
    
}
