package pr5;
import javax.swing.JOptionPane;

public class AppBanco {

	public static void main(String[] args) {
		banco cl1, cl2;
		cl1 = new banco("Eva Porada", "4567891234", 1000.0);
		cl2 = new banco("Jacinto Cinete", "87974567975", 0.0);
		
		cl1.ingreso(cl1.leer("Dinero a Ingersar (Eva)"));
		cl1.retirar(cl1.leer("Dinero a Retirar (Eva)"));
		JOptionPane.showMessageDialog(null,cl1.toString());
		
		cl2.ingreso(cl2.leer("Dinero a Ingersar (Jacinto)"));
		cl2.retirar(cl2.leer("Dinero a Retirar (Jacinto)"));
		JOptionPane.showMessageDialog(null,cl2.toString());

	}

}
