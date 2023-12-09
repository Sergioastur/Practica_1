package pr2Ej7;
import javax.swing.JOptionPane;

public class AppCalculadora {

	public static void main(String[] args) {
		Calculadora c;
		c = new Calculadora();
		char ele;
		
		c.setN1(c.leer());
		c.setN2(c.leer());
		
		ele = c.leerSigno();
		
		switch (ele) {
		case '+':
			JOptionPane.showMessageDialog(null,c.getN1()+"+"+c.getN2()+"= "+ c.getSum());
		break;
		case '-':
			JOptionPane.showMessageDialog(null,c.getN1()+"-"+c.getN2()+"= "+ c.getRes());
		break;
		case '*':
			JOptionPane.showMessageDialog(null,c.getN1()+"*"+c.getN2()+"= "+ c.getMul());
		break;
		case '/':
			JOptionPane.showMessageDialog(null,c.getN1()+"/"+c.getN2()+"= "+ c.getDiv());
		break;
		case '%':
			JOptionPane.showMessageDialog(null,c.getN1()+"%"+c.getN2()+"= "+ c.getRst());
		break;
		case '^':
			JOptionPane.showMessageDialog(null,c.getN1()+"^"+c.getN2()+"= "+ c.getExp());
		break;
		default:
			JOptionPane.showMessageDialog(null,"Caracter invalido");
		break;
		}

	}

}
