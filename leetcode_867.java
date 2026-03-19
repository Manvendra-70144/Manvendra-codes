public class leetcode_867 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        tanspose_Matrix(arr);
    }

    public static void tanspose_Matrix(int [] [] arr){
        int [] [] temp = new int[arr[0].length][arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                temp[j][i] = arr[i][j];
            }
        }

        for(int i=0; i<temp.length; i++){
            for(int j=0; j<temp[i].length; j++){
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
}
