
import java.util.Scanner;

public class ArrayName {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        char []arr = n.toCharArray();

        for(int i=0;i<arr.length;i++){


            System.out.print(arr[i]);
        }

    }
}
