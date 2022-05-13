
import java.util.Scanner;

public class AscendingDescending {

    public static void main(String[]args){

        boolean flag = true;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                flag = false;
            }

        }

        if(flag){
            System.out.println("Ascending sorted");
        }
        else
        {
            System.out.println("Not Sorted");
        }

    }
}
