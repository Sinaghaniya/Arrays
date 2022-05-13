import java.util.Scanner;

//this program is an Example of a Linear Search
public class Array4 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of the Array:");

        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter inputs of the Array:");

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("Enter which Number You need to Find:");

        int x = sc.nextInt();//the array we need to find

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("X found at index:"+i);
            }
        }

    }
}