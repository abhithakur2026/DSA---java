import java.util.*;
public class Pattern6 {
    public static void main(String []args){
        int n=5;
        int m=4;
        for(int i=1;i<=n; i++){
            for(int j=1;j<=m;j++){
                if(j==1||j==4){
                    System.out.print("*");
                }
                 System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
