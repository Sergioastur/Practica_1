package pr7Ej2dv;

import javax.swing.JOptionPane;

public class Alquiler {
	private Double km;

	public Alquiler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alquiler(Double km) {
		super();
		this.km = km;
	}

	public Double getKm() {
		return km;
	}

	public void setKm(Double km) {
		this.km = km;
	}
	
	public Double fijo() {
		double f;
		f = this.km * 130;
		return f;
	}
	
	public Double hasta1000() {
		double h;
		h = (this.km-300.0)*135;
		return h;
	}
	
	public Double mas() {
		double m;
		m = (this.km-1000.0)*145;
		return m;
	}
	
	public Double impuestos(double res) {
		double i;
		i = res+(res*0.16);
		return i;
	}
	
	public Double leer() {
		double n;
		String texto=JOptionPane.showInputDialog("KM realizados:");
		n=Double.parseDouble(texto);
		return n;
	}

}
