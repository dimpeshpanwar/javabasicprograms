public class ArrayRotation {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 }, rotate = 5;

        int i = rotate;
        
        while (true) {

            System.out.print(arr[i] + " ");

            i = i == arr.length ? 0 : i+1;

            if(i == rotate) break;
        }

    }
}
