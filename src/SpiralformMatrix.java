
import java.util.Scanner;

public class SpiralformMatrix {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Order Matrix:");

        int rowStart= 0,rowend = row-1;

        int colStart= 0,colend=col-1;

        while(rowStart<=rowend && colStart<=colend){

            for(int i=colStart;i<=colend;i++){

                System.out.print(arr[rowStart][i]+" ");
            }

            rowStart++;

            for(int j=rowStart;j<=rowend;j++){
                System.out.print(arr[j][colend]+" ");
            }
            colend--;

            for(int i=colend;i>=colStart;i--){
                System.out.print(arr[rowend][i]+" ");
            }

            rowend--;

            for(int j =rowend;j>=rowStart;row--){
                System.out.print(arr[j][colStart]);
            }

            colStart++;

            System.out.println();
        }
    }
}
