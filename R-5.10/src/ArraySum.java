
public class ArraySum {
	
	public static void main(String[] args) {
		int[][] array1 = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }};
		
		System.out.println(sumMatrix(array1,0,0));
	}
	
	
	public static int sumMatrix ( int[][] matrix , int rowNum, int colNum){
		
		int size = matrix.length;
		
		if (colNum == size){
			return sumMatrix(matrix, rowNum + 1, 0);
		}
		else if (rowNum == size){
			return 0;
		}
		else 
		return (matrix[rowNum][colNum] + sumMatrix(matrix, rowNum,colNum + 1));
	}
}
	
