package dsa;
import java.util.*;

public class Digits_Priint {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int d =0;
	int temp =n;
	while(temp!=0) {
		temp= temp/10;
		d++;
	}
	int div =(int)Math.pow(10, d - 1);
	while(div!=0) {
		int q = n / div;
		System.out.println(q);
		
		n = n%div;
		div= div/10;		
	}
  }
}