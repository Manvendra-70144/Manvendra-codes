public class leetcode_27 {
    public static void main(String[] args) {
        int [] arr = {3,2,2,3}; 
        int elm = 3;
        remove_Element(arr,elm);
    }

    public static void remove_Element(int [] arr , int el){

        int count=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != el){
                arr[count] = arr[i];
                count++;
            }
        }
        System.out.println(count);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
