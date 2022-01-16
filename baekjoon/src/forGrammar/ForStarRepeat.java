package forGrammar;

import java.util.Scanner;

public class ForStarRepeat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			
			for (int j = N; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int m = 1; m <= i; m++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}

		sc.close();
	}

}
