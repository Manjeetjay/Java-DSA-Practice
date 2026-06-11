import java.util.*;

public class RidesTwo {
    public static void main(String[] args) {
        
    }

    public int earliestFinishTime(
            int[] landStartTime,
            int[] landDuration,
            int[] waterStartTime,
            int[] waterDuration) {

        Ride[] land = build(landStartTime, landDuration);
        Ride[] water = build(waterStartTime, waterDuration);

        int ans = Integer.MAX_VALUE;

        ans = Math.min(
                ans,
                solve(landStartTime, landDuration, water)
        );

        ans = Math.min(
                ans,
                solve(waterStartTime, waterDuration, land)
        );

        return ans;
    }

    private int solve(
            int[] firstStart,
            int[] firstDuration,
            Ride[] second) {

        int n = firstStart.length;

        int[] finish = new int[n];

        for (int i = 0; i < n; i++) {
            finish[i] =
                    firstStart[i]
                    + firstDuration[i];
        }

        Arrays.sort(finish);

        int p = -1;

        int ans = Integer.MAX_VALUE;

        for (int f : finish) {

            while (
                    p + 1 < second.length
                    &&
                    second[p + 1].start <= f
            ) {
                p++;
            }

            if (p >= 0) {
                ans =
                        Math.min(
                                ans,
                                f + second[p].prefixMinDuration
                        );
            }

            if (p + 1 < second.length) {
                ans =
                        Math.min(
                                ans,
                                second[p + 1].suffixMinFinish
                        );
            }
        }

        return ans;
    }

    private Ride[] build(
            int[] start,
            int[] duration) {

        int n = start.length;

        Ride[] rides = new Ride[n];

        for (int i = 0; i < n; i++) {
            rides[i] =
                    new Ride(
                            start[i],
                            duration[i]
                    );
        }

        Arrays.sort(
                rides,
                Comparator.comparingInt(
                        a -> a.start
                )
        );

        rides[0].prefixMinDuration =
                rides[0].duration;

        for (int i = 1; i < n; i++) {

            rides[i].prefixMinDuration =
                    Math.min(
                            rides[i - 1]
                                    .prefixMinDuration,
                            rides[i]
                                    .duration
                    );
        }

        rides[n - 1]
                .suffixMinFinish =
                rides[n - 1]
                        .start
                +
                rides[n - 1]
                        .duration;

        for (
                int i = n - 2;
                i >= 0;
                i--
        ) {

            rides[i]
                    .suffixMinFinish =
                    Math.min(rides[i + 1]
                                    .suffixMinFinish,

                            rides[i]
                                    .start
                            +
                            rides[i]
                                    .duration
                    );
        }
        return rides;
    }

    static class Ride {
        int start;
        int duration;
        int prefixMinDuration;
        int suffixMinFinish;

        Ride(int s, int d) {
            start = s;
            duration = d;
        }
    }
}
