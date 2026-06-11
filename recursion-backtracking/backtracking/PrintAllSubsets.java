package backtracking;

import java.util.ArrayList;

public class PrintAllSubsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        ArrayList<Integer> ans = new ArrayList<>();
        printAllUniqueSubsets(arr, ans, 0);
    }


    // for unique elements in array  

    public static void subsets(int[] arr, ArrayList<Integer> ans, int i) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        // include element
        ans.add(arr[i]);
        subsets(arr, ans, i + 1);

        // exclude element
        ans.remove(ans.size() - 1);
        subsets(arr, ans, i + 1);
    }


    // for duplicates in array
    public static void printAllUniqueSubsets(int arr[], ArrayList<Integer> ans, int i) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        // include element
        ans.add(arr[i]);
        printAllUniqueSubsets(arr, ans, i + 1);
        // exclude element
        ans.remove(ans.size() - 1);

        while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
            i++;
        }
        printAllUniqueSubsets(arr, ans, i+1);
    }
}
