package pr2Ej6;

import java.util.Scanner;

public class Calculo {
	private Integer num;

	public Calculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculo(Integer num) {
		super();
		this.num = num;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
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
	
	public boolean par() {
		if (this.num%2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean multi5() {
		if (this.num%5 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean perfecto() {
		int suma = 0;
		for (int i = 1; i < this.num; i++) {                           
            if (this.num % i == 0) {
                 suma = suma + i;   
            }
		}
        
        if (suma == this.num) {                           
            return true;
        } else {
        	return false;

        }
		
	}

}
