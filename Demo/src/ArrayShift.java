
public class ArrayShift {

	public static void main(String[] args) {
		int[] arr = { 5,4,10,1,6,2 };
		for (int i = 1; i < arr.length; i++) {
			int j = i-1;
			int temp=arr[i];
			while (j >= 0 && temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
