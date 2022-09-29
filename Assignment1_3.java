/* Write a program to print
 
  		* * * * * * * * * * * * * * 
		* * * * * *   * * * * * * * 
		* * * * *       * * * * * * 
		* * * *           * * * * * 
		* * *               * * * * 
		* *                   * * * 
		*                       * * 
		*                         * 
		*                         * 
		*                         * 
		*                         * 
		*                         * 
		*                         * 
		* * * * * * * * * * * * * * 

 */
public class Assignment1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col, count=14;
		for(row=0; row<count; row++) {
			for(col=0; col<count; col++) {
				//if(row==0 || row==1 && col!=(count-1)/2 || row==2 && col!=((count-1)/2+1) && col!=((count-1)/2)-1 && col!=(count-1)/2)
				if(row==0 || col==0 || row==count-1 || col==count-1 || row+col<=(count-1)/2 || col-row>=(count-1)/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
