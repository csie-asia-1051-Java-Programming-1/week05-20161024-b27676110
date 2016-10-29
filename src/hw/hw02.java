package hw;

import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		for(int i =1;i<=n;i++){
			sum = sum+i;
			if(sum>n){
				
				System.out.println(i-1);
				break;
			}
		
			
			
		}
		

	}

}
