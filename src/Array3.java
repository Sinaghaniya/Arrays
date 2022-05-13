
import java.util.Scanner;

public class Array3 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];//Array size define

        for(int i=0;i<n;i++){//Array will print till n

            arr[i] = sc.nextInt();//Array input

            System.out.println(arr[i]);//Array printing
        }

    }
}
