
public class Arrays {

    public static void main(String[]args){

        int[] arr = new int[5];

        arr[0] = 97;
        arr[1] = 88;
        arr[2] = 98;

        System.out.println("Without loop:");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("With Loop:");

        int arr1[] = new int[5];

        arr1[0] = 99;
        arr1[1] = 77;
        arr1[2] = 88;

        for(int i=0;i<3;i++){
            System.out.println(arr1[i]);
        }


    }
}
