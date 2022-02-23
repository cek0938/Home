package ex2;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int result = 0;
		
		
		System.out.println("put numbers of the dice");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		if(a == b && a == c) {
			result = 10000 + a * 1000;
		}else if (a == b || a == c || c == b) {
			if(a > b && a > c) {
				result = 1000 + a * 100;
			}else if (b > a && b > c) {
				result = 1000 + b * 100;
			}else if (c > a && c > b) 
					result = 1000 + c * 100;	
				}else {
			if (!(a == b) && !(a == c) && !(b == c)) {
				if (a > b && a > c) {
					result = (a * 100);
				}else if (b > a && b > c) {
					result = (b * 100);
				}else if (c > a && c > b) {
					result = (c * 100);
				}else {
					System.out.println("error");
				}
			}
		}
		System.out.println(result);
	}
}


