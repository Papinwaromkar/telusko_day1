import java.util.Scanner;
public class PascalUsingRecurtion {
        public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);  
         System.out.print("Enter the number levels: ");
          int rows = sc.nextInt();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(pascalValue(i, j) + " ");
                }
                System.out.println();
            }
        }
    
        public static int pascalValue(int row, int column) {
            if (column == 0 || row == column) {
                return 1;
            } else {
                return pascalValue(row - 1, column - 1) + pascalValue(row - 1, column);
            }
        }
    }
    
    
