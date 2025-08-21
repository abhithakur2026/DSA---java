import java.util.*;
public class NoDuplicacy {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();

        int []arr=new int[size];

        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
        }
        System.out.print("the array you enetred is ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int x=arr[0];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;){
                if(arr[i]==arr[j]){
                    for(int k=j;k<size-1;k++){
                        arr[k]=arr[k+1];
                    }
                    size--;
                }
                else{
                    j++;
                }
            }
        }
        System.out.println("array after removing the duplicates");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
