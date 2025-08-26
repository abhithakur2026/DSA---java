import java.util.*;
public class MaxMin {
    public static void main(String[]args){
        Scanner ac=new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int size=ac.nextInt();

        int []a1=new int[size];
        for(int i =0;i<=size;i++){
          a1[i]=ac.nextInt();
        }
        int max=a1[0];
        int min=a1[0];
        for(int i=0;i<size;i++){
            if(a1[i]>max){
                max=a1[i];
            }
            if (a1[i]<min) {
                min=a1[i];
            }
        }
        System.out.println("the maximum number is :"+max);
        System.out.println("the maximum number is :"+min);
    }
}
