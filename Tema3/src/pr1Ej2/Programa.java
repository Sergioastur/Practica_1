package pr1Ej2;


public class Programa {

	public static void main(String[] args) {
		Articulo ar1;
		ar1 = new Articulo();
		
		ar1.setReferencia(1564);
		ar1.setNombre("Disco");
		ar1.setPrecio(50);
		
		System.out.println(ar1.toString());

	}

}
