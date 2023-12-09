package pr1Ej4;


import java.util.Scanner;

public class AppMenu {

	public static void main(String[] args) {
		Menu m1;
		m1 = new Menu();
		Scanner in;
		in = new Scanner(System.in);
		char ele;
		char rep;
		
		do {
		
		System.out.println("CALCULADORA");
		m1.setN1(m1.leer());
		m1.setN2(m1.leer());
		System.out.println("Los numeros introducidos son " + m1.getN1() + " y " + m1.getN2());
		
		System.out.println("Elija:");
		System.out.println("1.+");
		System.out.println("2.-");
		System.out.println("3.*");
		System.out.println("4./");
		System.out.println("5.%");
		System.out.print("Elección: ");
		ele = in.next().charAt(0);
		
		
		switch (ele) {
		case '1':
			System.out.println(m1.getN1() + "+" + m1.getN2() + "= " + m1.getSum());
		break;
		case '2':
			System.out.println(m1.getN1() + "-" + m1.getN2() + "= " + m1.getRes());
		break;
		case '3':
			System.out.println(m1.getN1() + "*" + m1.getN2() + "= " + m1.getMul());
		break;
		case '4':
			System.out.println(m1.getN1() + "/" + m1.getN2() + "= " + m1.getDiv());
		break;
		case '5':
			System.out.println(m1.getN1() + "%" + m1.getN2() + "= " + m1.getRst());
		break;
		default :
			System.out.println("Eleccion no valida");
		break;
		}
		
		System.out.print("¿Quieres repetir el programa?(S/N): ");
		rep = in.next().charAt(0);
		rep = Character.toUpperCase(rep);
		while (rep !='S' && rep !='N') {
			System.out.println("Eleccion no valida");
			System.out.print("¿Quieres repetir el programa?(S/N): ");
			rep = in.next().charAt(0);
			rep = Character.toUpperCase(rep);
		}
		} while(rep == 'S');
		in.close();
		

	}

}
