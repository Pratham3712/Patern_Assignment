package PattanJava;

public class Pattern21 {

	public static void main(String[] args) {
		int col = 5;
		int row = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j)

					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

	}

}
