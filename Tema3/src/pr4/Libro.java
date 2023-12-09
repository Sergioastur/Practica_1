package pr4;
import javax.swing.JOptionPane;

public class Libro {
	private String titulo;
	private String autor;
	private Integer numEjemplares;
	private Integer numPrestados;
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libro(String titulo, String autor, Integer numEjemplares, Integer numPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numPrestados = numPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(Integer numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public Integer getNumPrestados() {
		return numPrestados;
	}

	public void setNumPrestados(Integer numPrestados) {
		this.numPrestados = numPrestados;
	}
	
	public boolean prestamo() {
		boolean p;
		if (this.numEjemplares == 0) {
			p = false;
			return p;
		} else {
			this.numPrestados++;
			this.numEjemplares--;
			p = true;
			return p;
		}
	}
	
	public boolean devolucion() {
		boolean d;
		if (this.numPrestados == 0) {
			d = false;
			return d;
		} else {
			this.numPrestados--;
			this.numEjemplares++;
			d = true;
			return d;
		}
	}
	
	public int leer(String x) {
		int n;
		String texto=JOptionPane.showInputDialog("Escribe el " + x);
		n=Integer.parseInt(texto);
		return n;
	}
	
	public String leerS(String x) {
		
		String texto=JOptionPane.showInputDialog("Escribe el " + x);
		
		return texto;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numEjemplares=" + numEjemplares + ", numPrestados="
				+ numPrestados + "]";
	}
	
	

}
