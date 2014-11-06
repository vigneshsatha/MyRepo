package bucky;

import java.util.Scanner;

public class Addition {
	public void add(){
	double fnum,snum,answer;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first no:");
	fnum=sc.nextDouble();
	System.out.println("Enter Second no:");
	snum=sc.nextDouble();
	answer=fnum+snum;
	System.out.println("Answer="+answer);
}
}