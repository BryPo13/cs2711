
public class Find {

	
	public static void main(String[] args) {
		int[] array1 = new int[] { 1,1,1,5,7,};
		
		System.out.println(findK(array1,0,1,12));
	}
	
	public static boolean findK(int[] a, int i, int j, int k){
		 if (a[i] + a[j] == k) return true;
		 if (i < a.length-2 ){
			 if (j < a.length-1 ){
				 return findK(a, i, j+1, k);
				 }
			 j = i+1;
			 return findK(a, i+1, j+1, k);
		}
		return false;
		 

}
}
		
