package pr2Ej6;

import java.util.Scanner;

public class AppCalculo {

	public static void main(String[] args) {
		Scanner in;
		in = new Scanner(System.in);
		char rep;
		
		do {
			
			Calculo c;
			c = new Calculo();
			c.setNum(c.leer());
			
			if(c.par()) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
			}
			if(c.multi5()) {
				System.out.println("El numero es multiplo de 5");
			} else {
				System.out.println("El numero no es multiplo de 5");
			}
			if(c.perfecto()) {
				System.out.println("El numero es perfecto");
			} else {
				System.out.println("El numero es imperfecto");
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
