import java.util.*;
public class Multiplication {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows matrix1:");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of columns matrix1:");
        int cols1 = sc.nextInt();
        System.out.println("Enter the number of rows matrix2:");
        int rows2 = sc.nextInt();
        System.out.println("Enter the number of columns matrix2:");
        int cols2 = sc.nextInt();
        if(cols1!=rows2){
            System.out.println("the matrix multiplication is not possible :");
        }


        int [][]matrix1 = new int[rows1][cols1];
        int [][]matrix2= new int [rows2][cols2];
        int [][]matrixProduct = new int [rows1][cols2];

        System.out.println("Enter the elements of matrix1 :");
        for(int i = 0;i<rows1;i++){
            for(int j =0;j<cols1;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix2:");
        for(int i = 0;i<rows2;i++){
            for(int j =0;j<cols2;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix1 is :");
        for(int i = 0;i<rows1;i++){
            for(int j =0;j<cols1;j++){
            System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("matrix2 is :");
        for(int i = 0;i<rows2;i++){
            for(int j =0;j<cols2;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<rows1;i++) {
            for (int j = 0; j < cols2; j++) {
                matrixProduct[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    matrixProduct[i][j] = matrix1[i][k] * matrix2[k][j];
                }
            }
        }
            System.out.println("the resultant matrix after the multiplication is :");
            for(int i=0;i<rows1;i++){
                for(int j=0;j<cols2;j++){
                 System.out.print(matrixProduct[i][j]+" ");
                }
            System.out.println();
            }
        }
    }

