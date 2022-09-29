//Write a program(WAP) to print INEURON using pattern programming logic.

public class Assignment1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n=5;
		
		for(i=0; i<n; i++) {
			
			//I
			for(j=0; j<n; j++) {
				if(i==0 || j==(n-1)/2 || i==n-1) {
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}
			System.out.print(" ");
			
			//N
			for(j=0; j<n; j++) {
				if(j==0 || i==j || j==n-1) {
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}
			System.out.print(" ");
			
			//E
			for(j=0; j<n; j++) {
				if(i==0 || j==0 || i==n-1 || i==(n-1)/2) {
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}
			System.out.print(" ");
			
			//U
			for(j=0; j<n; j++) {
				if(j==0 && i!=(n-1) || i==(n-1) && j!=0 && j!=(n-1) || j==(n-1) && i!= (n-1)) {
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}
			System.out.print(" ");
			
			//R
			
			for(j=0; j<n; j++) {
				if(j==0 || i==0 && j!=(n-1) || i==(n-1)/2 && j!=(n-1) || i==1 && j==(n-1) || i==j && i!=1 && j!=1) {
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}
			System.out.print(" ");
			
			//O
			for(j=0; j<n; j++) {
				if(i==0 && j!=0 && j!=(n-1) || j==0 && i!=(n-1) && i!=0 || i==(n-1) && j!=0 && j!=(n-1) || j==(n-1) && i!=(n-1) && i!=0) {
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}
			System.out.print(" ");
			
			//N
			for(j=0; j<n; j++) {
				if(j==0 || i==j || j==n-1) {
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}
			System.out.print(" ");
			
			
			System.out.println();
		}
		System.out.println();
	}

}

/*
****************************************OUTPUT***************************************

* * * * *  *       *  * * * * *  *       *  * * * *      * * *    *       *  
    *      * *     *  *          *       *  *       *  *       *  * *     *  
    *      *   *   *  * * * * *  *       *  * * * *    *       *  *   *   *  
    *      *     * *  *          *       *  *     *    *       *  *     * *  
* * * * *  *       *  * * * * *    * * *    *       *    * * *    *       *  

*/


