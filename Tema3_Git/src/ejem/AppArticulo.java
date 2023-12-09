package ejem;

public class AppArticulo {

	public static void main(String[] args) {
		Articulo a1,a2,a3;
		
		a1=new Articulo();
		a1.setReferencia(100);
		a1.setDesignacion("Mortadelo y Filemón");
		a1.setPrecio(7.5);
		a1.setCategoria("Humor");
		System.out.println("REFERENCIA: " + a1.getReferencia() + " Designación: " + a1.getDesignacion() + " Categoria: " + a1.getCategoria() + " Precio: " + a1.getPrecio());
		
		a2=new Articulo();
		a2.setReferencia(101);
		a2.setDesignacion("Mortadelo y Filemón 2");
		a2.setPrecio(12.5);
		a2.setCategoria("Humor");
		System.out.println(a2.toString());
		
		a3=new Articulo(333, "Libro lectura", 89.90, "Lectura");
		System.out.println(a3.toString());
		
		double sum = a1.getPrecio()+a2.getPrecio()+a3.getPrecio();
		System.out.println("Suma de precios: " + sum);

	}

}
