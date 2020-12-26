package matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Enter two numbers: ");
		int lin = ler.nextInt();
		int col = ler.nextInt();
		
		int[][] mat = new int[lin][col];
		
		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%d x %d: ", i, j);
				mat[i][j] = ler.nextInt();
			}
		}
		
		System.out.println("\n Matriz: ");
		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%3d", mat[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("\nSearch a number: ");
		int number = ler.nextInt();
		
		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < col; j++) {
				if (mat[i][j] == number) {
					System.out.println("\nPosition: " + i + ", " + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if (j < col - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if(i < lin - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}		
		
		ler.close();

	}

}
