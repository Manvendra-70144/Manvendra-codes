public class leetcode_167 {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        tow_sum_II(arr,target);
    }

    public static void tow_sum_II(int [] arr, int target){
        
        int start =0, end = arr.length-1;
        int [] result = new int[2];
        for( int i=0; i<arr.length; i++){
            if(arr[start] + arr[end] > target) end--;
            if(arr[start] + arr[end] < target) start++;
            if(arr[start] + arr[end] == target){
                result[0] = start;
                result[1] = end;
            }
        }

        for (int k : result) {
            System.out.print(k + " ");
        }
    }    
}
