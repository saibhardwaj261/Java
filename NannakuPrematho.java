package Day7Collections;

import java.util.Scanner;

public class NannakuPrematho {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of persons");
		double n=sc.nextDouble();
		int p=1;
		while(n>=Math.pow(2, p))
			p++;
		p--;
		double alive =(n-(Math.pow(2, p)))*2+1;
		System.out.println("Position of person alive "+(int)alive);

	}

}
