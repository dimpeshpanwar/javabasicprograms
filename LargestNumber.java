public class LargestNumber {

    static int largestNum(int arr[]) {
        if (arr.length < 3)
            return -1;

        int firstMax = 0;
        int secondMax = 0;
        int thirdMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax) {
                thirdMax = arr[i];
            }
        }
        return thirdMax;
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 9, 7, 4, 8, 6, 3, 2, 1, 10 };
        int arr[] = { 2, 1, 3 };

        System.out.println(largestNum(arr));
    }
}
