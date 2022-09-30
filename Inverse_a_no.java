package dsa;
import java.util.*;

public class Inverse_a_no {
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();

		  int inv=0;
		  int op=1;
		  while(n!=0)
		  {
		    int od = n % 10;
		    int id = op;
		    int ip = od;
		    //Code only for no.s till 1-5 with each no.s used only once

		    inv = inv + id * (int)Math.pow(10, ip-1);

		    n = n / 10;
		    op++;
		  }
		    System.out.println(inv);
		  }

		}