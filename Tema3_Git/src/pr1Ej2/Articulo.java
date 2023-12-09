package pr1Ej2;

public class Articulo {

	private Integer referencia;
	private String nombre;
	private Integer precio;
	
	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Articulo(Integer referencia, String nombre, Integer precio) {
		super();
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Integer getReferencia() {
		return referencia;
	}

	public void setReferencia(Integer referencia) {
		this.referencia = referencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [referencia=" + referencia + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	

}
