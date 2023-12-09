package pr2Ej9;
import javax.swing.JOptionPane;


public class Raices {
	private double a;
	private double b;
	private double c;
	public Raices() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double formulaNeg() {
		
		double x2 =(-(this.b)-Math.sqrt(Math.pow(this.b, 2)-(4*this.a*this.c)))/(2*this.a);
		return x2;
		
		
	}
	
	public double formulaPos() {
		double x1 =(-(this.b)+Math.sqrt(Math.pow(this.b, 2)-(4*this.a*this.c)))/(2*this.a);
		return x1;
		
	}
	
	
	
	public double discriminante() {
		double dis = Math.pow(this.b, 2)-4*this.a*this.c;
		
		return dis;
	}
	
	public double leer(String l) {
		double n;
		String texto=JOptionPane.showInputDialog("Escribe el coeficiente (" + l + "):");
		n=Double.parseDouble(texto);
		return n;
	}

}
