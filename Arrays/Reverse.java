import java.util.*;
public class Reverse {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();

        int []array = new int[size];

        System.out.println("Enter the elements of the array :");
        for(int i = 0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int i = 0;int j=size-1;
        while(i<j){
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        System.out.println("the swapped array is :");
        for(int num:array){
            System.out.println(num+" ");
        }
    }
}
