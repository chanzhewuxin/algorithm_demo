package Search;

import java.util.*;

public class BinarySearchDemo {

	int[] arr;

	public BinarySearchDemo(int[] tArr) {
		arr = tArr;
	}

	/**查找某项所在位置
	 * @param item
	 * @return
	 */
	public int IndexOf(int item) {

		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m =l+ (r-1) / 2;
			if (arr[m] == item)
				return m;
			// 查找项大于中间值，丢掉左边
			if (item > arr[m])
				l = m + 1;
			if (item < arr[m])
				r = m - 1;
		} 
		
		return -1;
	}

	/**
	 * 查找是否包含某元素
	 * 
	 * @param key
	 * @return
	 */
	public boolean Contain(int key) {
		int min = 0, max = arr.length - 1, high = max / 2;

		if (key > max || key < min) {
			System.out.println("集合中没有找到元素 :" + key);
			return false;
		}
		boolean exsist = false;
		while (max > min) {
			high = max / 2; // 索引位置记录

			if (key > arr[high]) {
				min = high;
				continue;
			}
			if (key < arr[high]) {
				max = high;
				continue;
			}
			if (key == arr[high]) {
				exsist = true;
				break;
			}
		}
		return exsist;
	}

	/**
	 * 查找第一个元素的索引 List<Integer> strings = new ArrayList<Integer>();
	 * 
	 * @param item 查询元素
	 * @return 索引
	 */
	public int First(int item) {

		return -1;
	}

}
