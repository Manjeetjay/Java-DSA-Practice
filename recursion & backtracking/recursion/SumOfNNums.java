package recursion;
public class SumOfNNums {
    public static void main(String[] args) {
        System.out.println(sum(8));
    }

    private static int sum(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }
}
