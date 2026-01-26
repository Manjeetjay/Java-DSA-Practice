package recursion;
public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,6,7};
        boolean ans = isSorted(arr, arr.length-1);
        System.out.println(ans);

    }

    private static boolean isSorted(int arr[], int n) {
        if(n == 0) {
            return true;
        }
        boolean sorted = arr[n] > arr[n-1];
        return (sorted && isSorted(arr, n-1));
    }
}
