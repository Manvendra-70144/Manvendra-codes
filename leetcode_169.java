public class leetcode_169 {
    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1,2,2};
        System.out.println(majority_element(arr));
    }

    public static int majority_element(int [] arr){
        int majority = arr[0];
        int vote = 1;
        for(int i=1; i<arr.length; i++){
            if(vote == 0){
                vote++;
                majority = arr[i];
            }
            else if(majority == arr[i]) vote ++;
            else vote--;
        }
        return majority;
    }
    
}
