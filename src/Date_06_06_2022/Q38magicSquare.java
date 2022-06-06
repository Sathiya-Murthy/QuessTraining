package Date_06_06_2022;

import java.util.Scanner;

public class Q38magicSquare {
    public static void main(String[] args) {
        int length,sumOfDiagonal1=0,sumOfDiagonal2=0,sumOfFirstRow=0,sumOfFirstColumn=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows/columns in the matrix: ");
        length=scanner.nextInt();
        int[][] Matrix = new int[length][length];
        System.out.println("Enter the matrix value:");
        for(int i=0;i<length;i++){
            for (int j=0;j<length;j++)
                Matrix[i][j] = scanner.nextInt();
        }
        for(int i=0;i<length;i++){
            sumOfDiagonal1+=Matrix[i][i];
            sumOfDiagonal2+=Matrix[i][length-1-i];
        }
        if(sumOfDiagonal1==sumOfDiagonal2){
           for(int i=0;i<length;i++){
               for(int j=0;j<length;j++){
                    sumOfFirstRow+=Matrix[i][j];
                    sumOfFirstColumn+=Matrix[j][i];
               }
           }
           if(sumOfFirstRow==sumOfFirstColumn)  {
               System.out.println("Yes");
           }
           else
               System.out.println("No");

        }
        else {
            System.out.println("No");
        }
    }
}
