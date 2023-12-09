package pr7Ej2dv;
import javax.swing.JOptionPane;

public class AppAlquiler {

	public static void main(String[] args) {
		Alquiler coche;
		coche = new Alquiler();
		double res, pfinal;
		
		coche.setKm(coche.leer());
		if(coche.getKm() <= 300) {
			res = coche.fijo();
			JOptionPane.showMessageDialog(null,"Tiene que pagar en bruto " + res + "€");
		} else if (coche.getKm() <= 1000) {
			res = coche.hasta1000()+coche.fijo();
			JOptionPane.showMessageDialog(null,"Tiene que pagar en bruto (5€ extra por cada km a partir de 300km ) " + res + "€");
		} else {
			res = coche.mas()+coche.hasta1000()+coche.fijo();
			JOptionPane.showMessageDialog(null,"Tiene que pagar en bruto (10€ extra por cada km a partir de 1000km ) " + res + "€");
		}
		
		pfinal = coche.impuestos(res);
		JOptionPane.showMessageDialog(null,"Precio final con IVA = " + pfinal);
		

	}

}
