package pr7Ej2;

import javax.swing.JOptionPane;

public class AppSalario {

	public static void main(String[] args) {
		
		Salario[] trabajador = new Salario[3];
		Salario t1 = new Salario();
		Salario t2 = new Salario();
		Salario t3 = new Salario();
		trabajador[0] = t1;
		trabajador[1] = t2;
		trabajador[2] = t3;
		
		double salario;
		
		for (int i = 0; i<3; i++) {
		trabajador[i].setHoras(trabajador[i].leer());
		
		if (trabajador[i].getHoras()<=35) {
			JOptionPane.showMessageDialog(null,"Salario= "+trabajador[i].fijo());
		} else {
			salario = trabajador[i].fijo()+trabajador[i].extra();
			if(salario < 20000) {
				
				JOptionPane.showMessageDialog(null,"Salario= "+salario);
			} else {
				
				JOptionPane.showMessageDialog(null,"Salario(con impuestos)= "+ trabajador[i].impuestos(salario));
			}
		}
		}

	}

}
