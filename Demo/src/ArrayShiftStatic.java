import java.util.Arrays;
import java.util.Scanner;

public class ArrayShiftStatic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40,50,60};
		int k = 9;
		for (int j = 0; j < k; j++) {
			int first = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0]=first;
		}
		//for (int i = 0; i < arr.length; i++) {
			System.out.print(Arrays.toString(arr));
		//}
		scan.close();
	}

}
