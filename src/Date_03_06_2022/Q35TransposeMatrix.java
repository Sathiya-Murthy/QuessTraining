package Date_03_06_2022;

import java.util.Scanner;

public class Q35TransposeMatrix {
    public static void main(String[] args) {
        int l,m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nxn value:");
        l=scanner.nextInt();
        m=scanner.nextInt();
        int matrix[][]=new int[l][m];
        int Transpose[][] = new int[m][l];
        System.out.println("Enter the matrix value: ");
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("The original matrix. ");
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                Transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("The Transpose matrix.");
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
