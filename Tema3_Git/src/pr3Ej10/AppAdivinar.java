package pr3Ej10;
import javax.swing.JOptionPane;

public class AppAdivinar {

	public static void main(String[] args) {
		adivinar a;
		a = new adivinar();
		int ale;
		
		JOptionPane.showMessageDialog(null,"Se ha generado un número aleatorio entero entre 1 y 100, intente adivinarlo");
		ale = a.generaNumeroAleatorio(1, 100);
		do {
			a.setN(a.leer());
			if (a.getN() == ale) {
				JOptionPane.showMessageDialog(null,"Has acertado");
			} else {
				if (a.getN() > ale) {
					JOptionPane.showMessageDialog(null,"No has acertado: el número es menor. Prueba otra vez");
				} else {
					JOptionPane.showMessageDialog(null,"No has acertado: el número es mayor. Prueba otra vez");
				}
			}
			
		} while(a.getN() != ale);


	}

}
