package T3;


public class AppPersona {
	public static void main(String[] args) {
		Persona p1, p2;
		p1 = new Persona();
		p2 = new Persona("Paco", "Gonzalez", 35);
		
		p1.setNombre("Sergio");
		p1.setApellidos("Saavedra");
		p1.setEdad(18);
		
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		if (p1.getEdad()>p2.getEdad()) {
			System.out.println("El mayor es: " + p1.getNombre() + " " + p1.getApellidos() + " con " + p1.getEdad() + " años");
		} else {
			System.out.println("El mayor es: " + p2.getNombre() + " " + p2.getApellidos() + " con " + p2.getEdad() + " años");
		}
		
	}
}
