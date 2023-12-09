package pr7Ej2;

import javax.swing.JOptionPane;

public class Salario {
	private Integer horas;

	public Salario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salario(Integer horas) {
		super();
		this.horas = horas;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double fijo() {
		double sf;
		if(this.horas>=35) {
			this.horas = this.horas-35;
			sf = 35*50;
			return sf;
		} else {
			sf = this.horas*50;
			return sf;
		}
	}
	
	public double extra() {
		double ex;
		ex = this.horas * (50+(50*1.5));
		return ex;
	}
	
	public double impuestos(double i) {
		if(i<20000) {
			return i;
		} else {
			i = i-(i*0.20);
			return i;
		}
	}
	
	public Integer leer() {
		int n;
		String texto=JOptionPane.showInputDialog("Horas trabajadas:");
		n=Integer.parseInt(texto);
		return n;
	}

}
