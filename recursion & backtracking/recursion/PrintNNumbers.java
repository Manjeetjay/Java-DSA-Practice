package recursion;
public class PrintNNumbers{

    // Recurrence Relation : T(n) = O(1) + T(n-1)
    public static void main(String[] args) {
        helper(5);
    }

    public static void helper(int n) {
        if(n == 0) {
            return ;
        }
        System.out.print(n + " ");
        helper(n-1);
    }
}