public class pasculIteration {
    public static void pascaltriangleitrative(int numlines) {
        for (int r = 0; r < numlines; r++) {
            int value = 1;
            for (int c = 0; c <= r; c++) {
                System.out.print(value + " ");
                value = value * (r - c) / (c + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numlines = 8;
        pascaltriangleuitrative(numlines);
    }
}
