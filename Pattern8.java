package PattanJava;

public class Pattern8 {
	public static void main(String[] args) {

		int row = 5;
		int col = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(" " + (i) % 2 + " ");

			}
			col++;
			System.out.println();
		}
	}

}
