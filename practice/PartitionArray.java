public class PartitionArray{
    public static void main(String[] args) {
        int arr[] = {9,12,5,10,14,3,10};
        int pivot = 10;

        long start1 = System.nanoTime();
        method1(arr, pivot);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        method2(arr, pivot);
        long end2 = System.nanoTime();

        System.out.println("Method 1 -> " + (end1 - start1));
        System.out.println("Method 2 -> " + (end2 - start2));
    }

    public static int[] method1(int nums[], int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int start = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] < pivot) {
                ans[start++] = nums[i];
            } 
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] == pivot) {
                ans[start++] = nums[i];
            }
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] > pivot) {
                ans[start++] = nums[i];
            } 
        }
        return ans;

    }

    public static int[] method2(int nums[], int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int small = 0;
        for(int i: nums) {
            if (i < pivot) small++;
        }
        int start = 0, end = n-1;
        for(int i = 0; i < n; i++) {
            if(nums[i] < pivot) {
                ans[start++] = nums[i];
            } 
            if(nums[n-i-1] > pivot) {
                ans[end--] = nums[n-i-1];
            } 
            if(nums[i] == pivot) {
                ans[small++] = nums[i];
            }
        }
        return ans;
    }
}