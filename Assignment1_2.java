/*
Write a program to print
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
*/

public class Assignment1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col, n=4;
		for(row=1; row<=n; row++) {
			for(col=1; col<=n; col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

}
