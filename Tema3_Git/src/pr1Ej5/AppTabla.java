package pr1Ej5;

import java.util.Scanner;

public class AppTabla {

	public static void main(String[] args) {
		Tabla tabla;
		tabla = new Tabla();
		Scanner in;
		in = new Scanner(System.in);
		
		System.out.print("Inserta el numero del que quieres la tabla: ");
		tabla.setNum(in.nextInt());
		tabla.imprimirTabla();
		
		in.close();

	}

}
