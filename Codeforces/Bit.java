package Codeforces;

import java.util.*;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 0;
        while(t-->0) {
            String op = sc.next();
            if(op.equals("++X") || op.equals("X++")) {
                x += 1;
            } else if(op.equals("--X") || op.equals("X--")) {
                x -= 1;
            }
            
        }
        System.out.println(x);
    }
}