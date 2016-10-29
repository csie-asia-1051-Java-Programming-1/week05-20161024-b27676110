package hw;
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [ ][ ] data = new int[n][n];
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				System.out.print(data[i][j]);
			}
			System.out.println("");
		}

	}

}
