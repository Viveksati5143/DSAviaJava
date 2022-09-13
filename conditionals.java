package dsa;
import java.util.*;

public class conditionals {
	public static void main(String[] args) {
		int x = 10;
		if(x % 2 == 0) {
			System.out.println(x + " is even");
		}
		else {
			System.out.println(x + " is odd");
		}
		System.out.println("Conditional Statements");
		
		int x1 = 40;
		int x2 =20;
		if(x1 == x2) { 
			System.out.println(x1 + " is equal to " + x2);
		}
		else{
			if(x1>=x2) {
				System.out.println(x1 + " is greater than " + x2);
			}
			else { 
				System.out.println(x1 + " is smaller than " + x2);
			}
		}
		int a = 10;
		int b = 20;
		if(a == b) {
			System.out.println(a + " is equal to " + b);
		}
		else if(a >= b) {
			System.out.println(a + " is greater than" + b);
		}
		else {
			System.out.println(a + " is smaller than " + b);
		}

	}

}
