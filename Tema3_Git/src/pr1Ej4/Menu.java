package pr1Ej4;

import java.util.Scanner;

public class Menu {
	private Integer n1;
	private Integer n2;
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(Integer n1, Integer n2) {
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
	
	public Integer getDiv() {
		return (this.n1/this.n2);
	}
	
	public Integer getRst() {
		return (this.n1%this.n2);
	}
	
	public Integer leer() {
		Scanner in;
		in = new Scanner(System.in);
		int n;
		System.out.println();
		System.out.print("Introducir numero: ");
		n=in.nextInt();
		return n;
	}
	

}
