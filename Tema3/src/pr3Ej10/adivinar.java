package pr3Ej10;
import javax.swing.JOptionPane;

public class adivinar {
	private Integer n;

	public adivinar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public adivinar(Integer n) {
		super();
		this.n = n;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}
	
	public int generaNumeroAleatorio(int minimo,int maximo){
		 
		int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
		return num;
	}
	
	public int leer() {
		int n;
		String texto=JOptionPane.showInputDialog("Escribe el numero :");
		n=Integer.parseInt(texto);
		return n;
	}

	

}
