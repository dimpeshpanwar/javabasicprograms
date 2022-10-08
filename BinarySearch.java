import java.util.Arrays;

public class Array_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 72, 76, 80 };
		System.out.println(Arrays.toString(arr));
		System.out.println(Search(arr, 80));

	}

	public static int Search(int[] arr, int ele) {
		int li = 0;
		int hi = arr.length - 1;
		while (li <= hi) {
			int mid = (li + hi) / 2;
			if (arr[mid] == ele) {
				return mid;
			} else if (arr[mid] > ele) {
				hi = mid - 1;
			} else {
				li = mid + 1;
			}
		}
		return -1;
	}
}

// Output
// [10, 20, 30, 40, 50, 60, 70, 72, 76, 80]
// 9
