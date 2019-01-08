package Search;

public class Program {

	public static void main(String[] args) {
		int [] tmpArr = new int[] {2,3,3,5,5,5,6,6};
		
		BinarySearchDemo search  = new BinarySearchDemo(tmpArr);

		int index = search.IndexOf(6);
		
		System.out.println("Œª÷√£∫"+index);
//		boolean isContain = demo.Contain(5);
//		
//		System.out.println(isContain);
		
	}

}
