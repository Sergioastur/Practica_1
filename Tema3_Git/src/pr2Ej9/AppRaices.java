package pr2Ej9;

import javax.swing.JOptionPane;

public class AppRaices {

	public static void main(String[] args) {
		Raices r;
		r = new Raices();
		double dsc;
		
		r.setA(r.leer("a"));
		r.setB(r.leer("b"));
		r.setC(r.leer("c"));
		
		dsc = r.discriminante();
		JOptionPane.showMessageDialog(null, "Discriminante = " + dsc);
		if (dsc > 0) {
			double x1 = r.formulaPos();
			double x2 = r.formulaNeg();
			JOptionPane.showMessageDialog(null,"x= " + x1 + " ; " + " x= " + x2);
		} else if (dsc == 0) {
			double x = r.formulaPos();
			JOptionPane.showMessageDialog(null,"(Solo tiene una solucion real) x= " + x);
		} else {
			JOptionPane.showMessageDialog(null, "No tiene soluciones reales");
		}
		
		

	}

}
