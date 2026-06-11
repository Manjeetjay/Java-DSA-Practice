package recursion;
public class NFactorial {

    // Recurrence Relation : T(n) = O(10) + T(n-1)
    public static void main(String[] args) {
        int n = 8;
        int ans  = factorial(n);
        System.out.println("The factorail of " + n + " = " + ans);
    }

    private static int factorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
