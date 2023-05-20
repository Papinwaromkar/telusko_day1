import java.util.Scanner;
public class pascaltriangle {
    public static void main(String[] args){
        System.out.println("Enter the no of lines ");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int noofspaces=num;
        int number=1;
        for(int i=0;i<num;i++){
            for(int s=1;s<noofspaces;s++){
                System.out.print(" ");
            }
            number=1;
            for( int j=0;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);

            }
            noofspaces--;
            System.out.println();
        }
    }

}
