package hw;
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double n = scn.nextInt();
		double sum = 0;
		double a =1,b=2;
		for(int i = -1;i<=(n/2)-1;i++){
			
			sum = sum +1/(a*b);
			a+=2;
			b+=2;
		}
		System.out.println(sum);
	}

}
