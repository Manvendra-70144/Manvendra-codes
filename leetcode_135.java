public class leetcode_135 {
    public static void main(String[] args) {
        int[] ratings = { 0, 2, 6, 1, 0, 4, 8 };
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {

        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int ans = 0;
        left[0] = 1;
        right[n - 1] = 1;

        // left
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                left[i] = left[i - 1] + 1;
            else
                left[i] = 1;
        }

        // right
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                right[i] = right[i + 1] + 1;
            else
                right[i] = 1;
        }

        for (int i = 0; i < left.length; i++) {
            ans += Math.max(left[i], right[i]);
        }
        return ans;
    }

}
