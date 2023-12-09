package pr5;
import javax.swing.JOptionPane;

public class banco {
	private String nombre;
	private String numCuenta;
	private Double saldo;
	
	public banco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public banco(String nombre, String numCuenta, Double saldo) {
		super();
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void ingreso(double i) {
		this.saldo = this.saldo + i;
		JOptionPane.showMessageDialog(null, "Se han ingresado " + i);
	}
	
	public void retirar(double r) {
		
		if(this.saldo<r) {
			JOptionPane.showMessageDialog(null, "NO HAY SUFICIENTE SALDO");
		} else {
			this.saldo = this.saldo - r;
			JOptionPane.showMessageDialog(null, "Operacion completada");
			
		}
	}
	
	public double leer(String x) {
		double n;
		String texto=JOptionPane.showInputDialog(x);
		n=Double.parseDouble(texto);
		return n;
	}
	
	public String leerS(String x) {
		
		String texto=JOptionPane.showInputDialog("Escribe el " + x);
		
		return texto;
	}

	@Override
	public String toString() {
		return "banco [nombre=" + nombre + ", numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
	}
	
	

}
