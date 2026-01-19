public class MatrixPrefixSum {
    public static void main(String[] args) {
        
        int mat[][] = {{1,2,3,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
        System.out.println("Matrix :-");
        printMatrix(mat);
        System.out.println("Prefix Sum matrix :-");
        printMatrix(prefixSum(mat));
    }

    public static int[][] prefixSum(int mat[][]) {
        int r = mat.length, c = mat[0].length;

        int[][] prefix = new int[r + 1][c + 1];

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                prefix[i][j] = mat[i - 1][j - 1] + prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1];
            }
        }
        return prefix;
    }

    public static void printMatrix(int mat[][]) {
        int r = mat.length, c = mat[0].length;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
