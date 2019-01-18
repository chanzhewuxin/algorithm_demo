package Search;

/**  
 * ClassName: Exercises  
 * @author 禅者无心
 * @version 1.0 
 * Create Time: 2019/01/18 19:11  
 * Description: TODO 类的实现描述 
 */ 
public class Exercises {

	/**
	 * 852. Peak Index in a Mountain Array
	 * 题目URL： https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
	 * @param A
	 * @return
	 */
	public int peakIndexInMountainArray(int[] A) {
		int l = 0, r = A.length, m = r;

		while (l <= r) {

			m = (l + r) / 2;

			if (A[m - 1] < A[m] && A[m] > A[m + 1])
				return m;

			if (A[m - 1] > A[m]) {
				r = m;
			} else {
				l = m;
			}
		}

		return 0;
	}
}
