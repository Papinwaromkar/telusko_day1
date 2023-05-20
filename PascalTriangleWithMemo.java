import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PascalTriangleWithMemo {
    private static Map<Integer, Map<Integer, Integer>> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int coef = getCoef(i, j);
                System.out.print(coef + " ");
            }
            System.out.println();
        }
    }

    private static int getCoef(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        }
        if (memo.containsKey(row) && memo.get(row).containsKey(col)) {
            return memo.get(row).get(col);
        }
        int coef = getCoef(row - 1, col - 1) + getCoef(row - 1, col);
        // Store the computed coefficient in the memoization table
        memo.putIfAbsent(row, new HashMap<>());
        memo.get(row).put(col, coef);
        return coef;
    }
}
