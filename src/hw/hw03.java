package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		for(int i = 1;i<=100;i++){
		Double sum = Math.pow(n, i);
		if(sum>10000){
			System.out.print(i-1);
			break;
		}
			
		}

	}

}
