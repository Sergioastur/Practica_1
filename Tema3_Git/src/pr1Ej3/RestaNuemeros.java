package pr1Ej3;

public class RestaNuemeros {
	private Integer n1;
	private Integer n2;
	
	
	public RestaNuemeros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaNuemeros(Integer n1, Integer n2) {
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
	
	
	
	public Integer getResta() {
		return (n1-n2);
	}
	
	public Integer restar (int a, int b) {
		int res;
		res = a-b;
		return res;
		
	}

}
