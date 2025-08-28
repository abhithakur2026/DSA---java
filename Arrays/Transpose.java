import java.util.*;
public class Transpose {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int rows = sc.nextInt();
        System.out.println("enter the number of the columns :");
        int cols = sc.nextInt();

        int [][]matrix = new int[rows][cols];

        System.out.println("enter the elements :");
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("the given matrix is :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the transpose of the matrix is : ");
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
