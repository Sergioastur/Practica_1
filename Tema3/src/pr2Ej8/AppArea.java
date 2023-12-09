package pr2Ej8;
import javax.swing.JOptionPane;

public class AppArea {

	public static void main(String[] args) {
		Area a;
		a= new Area();
		char ele;
		
		ele = a.ele();
		
		switch (ele) {
		case 'C':
			a.setBase(a.leer("radio"));
			JOptionPane.showMessageDialog(null, "Area circulo: " + (Math.pow(a.getBase(), 2)*3.14));
		break;
		case 'T':
			a.setBase(a.leer("base"));
			a.setAltura(a.leer("altura"));
			JOptionPane.showMessageDialog(null, "Area triangulo: " + ((a.getBase()*a.getAltura())/2));
		break;
		case 'D':
			a.setAltura(a.leer("lado"));
			JOptionPane.showMessageDialog(null, "Area cuadrado: " + (a.getAltura()*a.getAltura()));
		break;
		}
		

	}

}
