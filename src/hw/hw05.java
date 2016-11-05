package hw;
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int data [ ][ ]  = new int[n][n];
		int sum=1;
		
		for(int i =0;i<n;i++){
			for(int j =0;j<=i;j++){
				data[i-j][j]=sum;
				sum++;
			}
		}	
		for(int i =1;i<n;i++){
			for(int j =0;j<n-i;j++){
				data[n-j-1][i+j]=sum;
				sum++;
			}
		}
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				System.out.print(data[i][j]+" ");
			}
			System.out.println("");
		}

	}
}
