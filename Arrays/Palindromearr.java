import java.util.*;
public class Palindromearr {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int []arr=new int[size];

        System.out.println("enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int i=0;
        int j=size-1;
        int flag=1;
        while(i<j){
            if(arr[i]==arr[j]){
                flag=1;
                break;
            }
            i++;
            j--;
        }
        if(flag==1){
            System.out.println("palindrome ");
        }
        if(flag==0){
            System.out.println("not a palindrome ");
        }
    }
}

