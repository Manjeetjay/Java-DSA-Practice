package recursion;
public class Fibbonaci {
   
    // Recurrence relation : T(n) = T(n-1) + T(n-2)
    public static void main(String[] args) {
        System.out.println(fibbo(5));
    }

    private static int fibbo(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        return fibbo(n-1) + fibbo(n-2);
    }
}
