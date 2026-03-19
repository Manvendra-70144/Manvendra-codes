public class leetcode_56 {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{8,10},{2,6},{15,18}};

        merger_Intervals(arr);

        // Print array
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void merger_Intervals(int [][]arr){
        sort_Array(arr);

        // just printing sorted array for now
        System.out.println("After Sorting:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Bubble Sort
    public static void sort_Array(int [][]arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){

                if(arr[j][0] > arr[j+1][0]){
                    int[] temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

   // Needs to be done 
}
