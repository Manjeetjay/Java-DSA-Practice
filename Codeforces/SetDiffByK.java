package Codeforces;

import java.util.*;

class SetDiffByK{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] B = new int[n + 1];
        List<Integer> S = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            B[i] = sc.nextInt();
            if (B[i] == 1) {
                S.add(i);
            }
        }

        boolean possible = true;

        // ✅ Condition 1: spacing
        for (int i = 1; i < S.size(); i++) {
            if (S.get(i) - S.get(i - 1) <= k) {
                possible = false;
                break;
            }
        }

        // ✅ Condition 2: coverage
        int ptr = 0;
        for (int i = 1; i <= n && possible; i++) {
            if (B[i] == 0) {
                boolean covered = false;

                // check nearest S elements
                while (ptr < S.size() && S.get(ptr) < i) ptr++;

                if (ptr < S.size() && Math.abs(S.get(ptr) - i) <= k)
                    covered = true;

                if (ptr - 1 >= 0 && Math.abs(S.get(ptr - 1) - i) <= k)
                    covered = true;

                if (!covered) {
                    possible = false;
                }
            }
        }

        System.out.println(possible ? "Yes" : "No");
    }
}