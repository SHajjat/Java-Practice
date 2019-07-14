package homeWorks;

public class Array {
	public static void main(String[] args) {
		int[][] a = {
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		};
		System.out.println(isMagic(a)); //true
		int[][] b = {
				{1, 1, 2},
				{3, 2, 3},
				{1, 4, 1}
		};
		System.out.println(isMagic(b)); //false
		int[][] c = {
				{1, 1, 1},
				{2, 2, 2}
		};
		System.out.println(isMagic(c)); //false
		int[][] d = {
				{8, 1, 6},
				{3, 5, 7},
				{4, 9, 2}
		};
		System.out.println(isMagic(d)); //true
	}
	
	public static boolean isMagic(int[][] array) {
		for ( int arr[] : array ) {
			if ( arr.length != array.length ) {
				return false;
			}
		}
		int sum = 0;
		for (int number : array[0]){
			sum+=number;
		}
		
		for (int i = 0 ;i<array.length;i++){
			int arrsum = 0;
			for(int j = 0 ; j<array[i].length;j++){
				arrsum+=array[i][j];
			}
			if (arrsum!=sum){
				return false;
			}
		}
		sum = 0 ;
		for (int i = 0 ; i <array.length;i++){
			sum+=array[0][i];
		}
		
		for (int i = 0 ; i<array.length;i++){
			int arrsum = 0;
			for(int j =0;i<array.length;j++){
				arrsum+=array[j][i];
			}
			if (arrsum!=sum){
				return false;
			}
		}
		int arrsum = 0;
		for (int i = 0 ; i<array.length;i++){
			arrsum+=array[i][i];
			
		}
		int revArr = 0;
		for (int i = array.length-1 ; i>=0;i++){
			revArr+=array[i][i];
			
		}
		if (revArr!=arrsum){
			return false;
		}
	return true;
	}
}

