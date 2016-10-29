package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。

 * Date: 2016/10/24
 * Author: 105021036 鄭東欣
 */
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int [ ] data = {105021036,
				        105021504,
				        105021201,
                        105021204,
                        105021090};
		int sum = 0;
		for(int i = 0;i<data.length;i++){
			for(int j = 0;j<data.length-i-1;j++){
				if(data[j]<data[j+1]){
					sum = data[j];
					data[j]=data[j+1];
					data[j+1]=sum;
				}
			}
			
		}
		System.out.println("由大到小排列:");
		for(int i = 0;i<data.length;i++){
			System.out.println(data[i]);
			
		}
		

	}

}
