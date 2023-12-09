package pr2Ej7;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculadora {
	private Integer n1;
	private Integer n2;
	public Calculadora() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculadora(Integer n1, Integer n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	public Integer getN1() {
		return n1;
	}
	public void setN1(Integer n1) {
		this.n1 = n1;
	}
	public Integer getN2() {
		return n2;
	}
	public void setN2(Integer n2) {
		this.n2 = n2;
	}
	
	public Integer getSum() {
		return (this.n1+this.n2);
	}
	
	public Integer getRes() {
		return (this.n1-this.n2);
	}
	
	public Integer getMul() {
		return (this.n1*this.n2);
	}
	
	public Double getDiv() {
		return (double) (this.n1/this.n2);
	}
	
	public Integer getRst() {
		return (this.n1%this.n2);
	}
	
	public Double getExp() {
		return (Math.pow(this.n1, this.n2));
	}
	
	public Integer leer() {
		int n;
		String texto=JOptionPane.showInputDialog("Escribe el operando :");
		n=Integer.parseInt(texto);
		return n;

	}
	
	public char leerSigno() {
		
		String signo=JOptionPane.showInputDialog("Escribe el operando :");
		return signo.charAt(0);

	}
	
	

}
