package pr1Ej3;

import java.util.Scanner;

import pr1Ej3.SumaNumeros;

public class AppSuma {

	public static void main(String[] args) {
		Scanner in;
		in = new Scanner(System.in);
		
		RestaNuemeros r1;
		SumaNumeros s1;
		
		s1 = new SumaNumeros();
		
		
		System.out.print("Numero 1: ");
		s1.setN1(in.nextInt());
		
		
		System.out.print("Numero 2: ");
		s1.setN2(in.nextInt());
		
		r1 = new RestaNuemeros(s1.getN1(), s1.getN2());
		
		System.out.println(s1.getN1() + "+" + s1.getN2() + "= " + s1.getSuma());
		System.out.println(s1.getN1() + "+" + s1.getN2() + "= " + s1.sumar(s1.getN1(), s1.getN2()));
		
		System.out.println(r1.getN1() + "-" + r1.getN2() + "= " + r1.getResta());
		
		in.close();
		

	}
	
	

}
