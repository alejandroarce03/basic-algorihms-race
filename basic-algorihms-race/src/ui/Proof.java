package ui;

import java.util.Scanner;

import model.Race;

public class Proof {

	private Race race;
	private Scanner sc;
	
	public Proof() {
		race = new Race();
		sc = new Scanner(System.in);
	}
	public static void main(String args[]) {
		Proof m = new Proof();
		m.exe1();
	}
	public void exe1() {
		System.out.println("operations");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("1)add,2)remove,3)consult");
		int operation = Integer.parseInt(sc.nextLine());
		System.out.println("1)recursive,2)iterative");
		int mode = Integer.parseInt(sc.nextLine());
	
		if(operation==1) {
			if(mode==1) {
				race.addABBRecursive(num);
				
			}
		}
	}
}
