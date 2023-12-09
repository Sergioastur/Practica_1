package pr2Ej8;
import javax.swing.JOptionPane;


public class Area {
	private double base;
	private double altura;
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Area(double radio, double base, double altura, double lado) {
		super();
		
		this.base = base;
		this.altura = altura;
		
	}

	

	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	

	
	
	
	public double leer(String w) {
		double n;
		String texto=JOptionPane.showInputDialog("Medida " + w + " :");
		n=Integer.parseInt(texto);
		return n;
	}
	
	
	
	public char ele() {
		
		String signo=JOptionPane.showInputDialog("Elige (C)irculo, (T)riangulo, Cua(D)rado : ");
		return signo.charAt(0);

	}

}
