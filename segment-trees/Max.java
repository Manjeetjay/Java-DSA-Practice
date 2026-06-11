
import java.util.Arrays;



public class Max {
    public static void main(String[] args) {
        int arr[] = {2,1,5,3,4,8,6};
        int query[][] = {{1,4},{3,6}};

        int seg[] = new int[4 * arr.length];
        helper(0, 0, arr.length-1, seg, arr);
    
        System.out.println(Arrays.toString(seg));

        for(int q[]: query) {
            int ans = doQuery(0, 0, arr.length-1, q[0], q[1], seg);
            System.out.println(ans);
        }
    }

    private static void helper(int idx, int left, int right, int[] seg, int[] arr) {
        if(left == right) {
            seg[idx] = arr[left];
            return ;
        }

        int mid = (left+right)/2;
        
        helper(2*idx+1, left, mid, seg, arr);
        helper(2*idx+2, mid+1, right, seg, arr);
        seg[idx] = Math.max(seg[2*idx+1], seg[2*idx+2]);
    }

    private static int doQuery(int idx, int start, int end, int left, int right, int[] seg) {
        if(start >= left && end <= right) return seg[idx];
        if(end < left || start > right) return Integer.MIN_VALUE;

        int mid = start + (end-start)/2;
        int l = doQuery(2*idx+1, start, mid, left, right, seg);
        int r = doQuery(2*idx+2, mid+1, end, left, right, seg);
        return Math.max(l,r);
    }
}