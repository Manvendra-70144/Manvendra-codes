public class Minimun_Platform_GFG {
    public static void main(String[] args) {
        int[] arr = { 1114, 825, 357, 1415, 54 }; // 1114 825 357 1415 54
        int[] dep = { 1740, 1110, 2238, 1535, 2323 }; // 1740 1110 2238 1535 2323
        System.out.println("Minimum Platform's => " + minimum_platforms(arr, dep));
    }

    public static int minimum_platforms(int[] arr, int[] dep) {

        sort(arr);
        sort(dep);
        int count = 0, min_platform = 0;
        int i = 0, j = 0;
        while(i<arr.length && j<dep.length) {
            if (arr[i] <= dep[j]) {
                count++;
                min_platform = Math.max(min_platform, count);
                i++;
            } else {
                count--;
                j++;
            }
        }
        return min_platform;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
