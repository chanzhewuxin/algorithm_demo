package Search;

public class Program {

	public static void main(String[] args) {
		int[] tmpArr = new int[] { 2, 3, 3, 5, 5, 5, 6, 6 };
		int[] tmpArr1 = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 8,
				8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 52 };

		BinarySearchDemo search = new BinarySearchDemo(tmpArr1);
//		int index = search.IndexOf(6);
//		System.out.println("Œª÷√£∫"+index);
//		boolean isContain = demo.Contain(5);
//		System.out.println(isContain);

		int firstIndex = search.FirstOfIndex(52);
		System.out.println(firstIndex);
	}

	public static int peakIndexInMountainArray(int[] A) {
		int l = 0, r = A.length - 1;

		while (l < r) {

			int m = (r - l) / 2;
			if (A[m - 1] > A[m] && A[m] > A[m + 1])
				return m;
			if (A[l] < A[m]) {
				l = m - 1;
			}
			if (A[l] > A[m]) {
				r = m + 1;
			}
		}
		return -1;
	}
}
