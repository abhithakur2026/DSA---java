import java.util.*;
public class MaxMinarr{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();

        int []arr=new int[size];

        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("the array is :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>arr[0]){
                max=arr[i];
            }
            if(arr[i]<arr[0]){
                min=arr[i];
            }
        }
        System.out.println("the maximum element is"+max );
        System.out.println("the minimum element is "+min);
    }
}
