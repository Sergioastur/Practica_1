package pr1Ej3;

public class SumaNumeros {
	private Integer n1;
	private Integer n2;
	
	
	public SumaNumeros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SumaNumeros(Integer n1, Integer n2) {
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
	
	
	
	public Integer getSuma() {
		return (n1+n2);
	}
	
	public Integer sumar (int a, int b) {
		int res;
		res = a+b;
		return res;
		
	}

	@Override
	public String toString() {
		return "SumaNumeros [n1=" + n1 + ", n2=" + n2 + ", res=" + (n1+n2) + "]";
	}
	
	
	
	

}
