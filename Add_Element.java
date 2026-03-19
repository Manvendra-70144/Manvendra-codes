public class Add_Element {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int position = 2;
        int value = 50;
        add_element_at_specific_index(arr,position,value);
    }

    public static void add_element_at_specific_index(int [] arr, int position, int value){

        int [] temp = new int[arr.length+1];
        int index = position-1;
        for(int i=0, j=0; i<temp.length; i++){
            if(i==index) temp[i] = value;
            else temp[i] = arr[j++];
        }

        for (int i : temp) {
            System.out.print(i + " ");
        }
    }
}
