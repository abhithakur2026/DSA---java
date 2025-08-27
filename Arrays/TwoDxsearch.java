import java.util.*;
public class TwoDxsearch {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number os rows :");
        int rows = sc.nextInt();
        System.out.println("enter the number of the columns:");
        int columns = sc.nextInt();
       // System.out.println("enter the value of the X:");
        //int X=sc.nextInt();

        int [][]numbers = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(numbers[i][j]+" ");
                if(numbers[i][j]==x){
                    System.out.println("the indices of x are:("+i+","+j+")");
                }
            }
            System.out.println();
        }

    }
}
