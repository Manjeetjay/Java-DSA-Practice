package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int ans = binarySearch(arr, 22, 0, arr.length-1);
        System.out.println(ans);
    }

    private static int binarySearch(int arr[], int target,int start, int end) {
        int mid = start + (end - start)/2;
        if(start > end) {
            return -1;
        }
        if(arr[mid] == target) {
            return mid;
        } 

        return (target > arr[mid]) ? binarySearch(arr, target, mid+1, end) : binarySearch(arr, target, start, mid-1);
    }
}
