import java.util.*;

public class BItManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 1;
        
        // bit manipulation functions

        getBit(n, pos);

        System.out.println("Set bit -> " + setBit(n, 1));

        System.out.println("Clear bit -> " + clearBit(n, 0));

        System.out.println("Toggle bit -> " + toggleBit(n, 1));

        System.out.println("Even or Odd -> " + checkEvenOdd(n));

        System.out.println("Power of 2 -> " + power2(n));

        System.out.println("Remove the lowest bit -> " + removeLastBit(n));

        sc.close();
    }

    // get bit -> get a bit on specific location
    public static void getBit(int n, int pos) {
        int bitMask = 1<<pos;
        
        if((bitMask & n) == 0) {
            System.out.println("The bit is 0");
        } else {
            System.out.println("The bit is 1");
        }
    }

    // set bit -> sets the bit to 1
    public static int setBit(int n, int pos) {
        int bitMask = 1<<pos;
        return bitMask | n;
        
    }

    // clear bit -> set bit to 0
    public static int clearBit(int n, int pos) {
        int bitMask=1<<pos;
        int negatedBitMask = ~(bitMask);
        return (negatedBitMask & n);
        
    }

    // toggle bit -> update bit 0 to 1 and 1 to 0
    public static int toggleBit(int n, int pos) {
        int bitMask = 1<<pos;
        return n ^ bitMask;
    }
    
    // check even or odd (without modulo)
    public static String checkEvenOdd(int n) {
        int mask = 1;
        return (mask & n) == 0 ? "Even":"Odd";
    }

    // check power of 2
    public static boolean power2(int n) {
        return (n & n-1) == 0 ? true:false;
    }

    // remove the lowest bit
    public static int removeLastBit(int n) {
        return n&n-1;
    }
}
