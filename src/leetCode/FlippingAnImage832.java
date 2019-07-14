package leetCode;

public class FlippingAnImage832 {
	public int[][] flipAndInvertImage(int[][] A) {
		int [][] B =new int [A.length][A[0].length];
		for (int i = 0 ;i<B.length;i++) {
			for ( int j = 0; j < B[i].length; j++ ) {
				B[i][i] = A[i][j]==0?1:0;
			}
		}
		
	return B;
	}
}
