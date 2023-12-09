package pr1Ej5;

public class Tabla {
	private Integer num;

	public Tabla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tabla(Integer num) {
		super();
		this.num = num;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	public void imprimirTabla() {
        System.out.println("Tabla del " + num + ":");
        for (int i = 0; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + "*" + i + "= " + resultado);
        }
	}

}
