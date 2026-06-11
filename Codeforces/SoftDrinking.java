package Codeforces;

import java.util.Scanner;

public class SoftDrinking {

    public static void main(String[] args) {
        // there are "n" friends
        // k bottles -> each having l mL
        // c limes -> each into d slices
        // p grams of salt

        // 3 friends - 4 bottles - 5 lites - 10 limes - 8 slices - 100 grams of salt - each friend need nl = 3 - 1 gram of salt each

        // max toast

        // total booze = bottle * l
        // total slices = lime * d
        // total salt = p

        //checks -> nl < total booze && sl < total slices && salt < total salt
        // if any condition fails -> return the minimum of three
        
        Scanner sc = new Scanner(System.in);
        int details[] = new int[8];
        for (int i = 0; i < details.length; i++) {
            details[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int toastBasedOnBooze = (details[1]*details[2])/(details[0]*details[6]);
        int toastBasedOnSalt = details[5]/(details[0]*details[6]);
        int toastBasedOnLemon = (details[3]*details[4])/details[0];

        min = Math.min(toastBasedOnSalt, Math.min(toastBasedOnBooze, toastBasedOnLemon));
        System.out.println(min);
    }
}