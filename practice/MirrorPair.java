public class MirrorPair {
    public static void main(String[] args) {
        int nums[] = {12, 21, 45, 33, 54};
        int ans = minMirrorPairDistance(nums);
        System.out.println(ans);
    }

    public static int minMirrorPairDistance(int[] nums) {
        int dist = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(isMirror(nums[i], nums[j])) {
                    dist = Math.min(dist, Math.abs(i - j));
                }
            }
        }

        return dist == Integer.MAX_VALUE ? -1 : dist; // good practice
    }

    private static boolean isMirror(int a, int b) {
        int temp = 0;
        while(a > 0) {
            temp = temp * 10 + (a % 10);
            a /= 10;
        }
        return temp == b;
    }
}
