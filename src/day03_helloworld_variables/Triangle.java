package day03_helloworld_variables;

public class Triangle {
	public static void main(String[] args) {
//		System.out.println("    *");
//		System.out.println("   * *");
//		System.out.println("  *   *");
//		System.out.println(" *     *");
//		System.out.println("*********"); 
//		System.out.println("*********\n *     *\n  *   *\n   * *\n    *\n");

//		int n, m= -3 , k = 3;
//		String star = "*", space = " ";
//		for (int s = 0 ; s <=1 ; s++)
//		if ( s == 0) {
//			m = m + 2;
//			k = k - 1;
//		}
//		else {
//			
//			m=m-2;
//			k=k+1;
//		}
//		
//        
//		
//		for (int i = 0; i <= 3; i++) {
//			if (i > 0) {
//				// System.out.print(star);
//				for (n = 0; n <= k; n++) {
//					System.out.print(space);// space on the left
//				}
//				System.out.print(star); // star on the right
//			}
//
//			if (i == 0) {
//				for (int l = 0; l <= 3; l++) {
//					System.out.print(space);//first 4 spaces for star 1
//
//				}
//			}
//			for (int j = 0; j < m; j++) {
//				System.out.print(space);// space between
//			}
//			System.out.print(star);// star on the left
//
//			System.out.println(space);// to go to next line
//			m = m + 2;
//			k = k - 1;
//			
//		}
//	
//	for (int d = 0; d<9 ; d++) {
//	System.out.print(star);
//}
//	}
////}
//		package day03_helloworld_variables;
//
//		public class Triangle {
//		    public static void main(String[] args) {
//		        System.out.println("    *");
//		        System.out.println("   * *");
//		        System.out.println("  *   *");
//		        System.out.println(" *     *");
//		        System.out.println("*********");
////		        System.out.println("*********\n *     *\n*     *\n*   *\n    *\n");

		        String star = "*", space = " ";
		        int n, m = -1, k = 3;

		        for (int i = 0; i <= 3; i++) {
		            if (i > 0) {
		                // System.out.print(star);
		                for (n = 0; n <= k; n++) {
		                    System.out.print(space);// space on the left
		                }
		                System.out.print(star); // star on the right
		            }

		            if (i == 0) {
		                for (int l = 0; l <= 3; l++) {
		                    System.out.print(space);//first 4 spaces for star 1

		                }
		            }
		            for (int j = 0; j < m; j++) {
		                System.out.print(space);// space between
		            }
		            System.out.print(star);// star on the left

		            System.out.println(space);// to go to next line
		            m = m + 2;
		            k = k - 1;
		            
		        }
		    
		    for (int d = 0; d<9 ; d++) {
		    System.out.print(star);
		}
		    }
		}
