package pr4;
import javax.swing.JOptionPane;

public class AppLibro {

	public static void main(String[] args) {
		Libro libro1, libro2;
		libro1 = new Libro("El Quijote", "Cervantes", 1, 0);
		libro2 = new Libro();
		String rep;
		
		libro2.setTitulo(libro2.leerS("titulo"));
		libro2.setAutor(libro2.leerS("autor"));
		libro2.setNumEjemplares(libro2.leer(" ejemplares"));
		libro2.setNumPrestados(0);
		
		
		
		do {
			
				JOptionPane.showMessageDialog(null,libro1.toString());
				int pd=libro1.leer("(1) Devolver (2) Prestamo");
				if(pd == 1) {
					if (libro1.devolucion()) {
						JOptionPane.showMessageDialog(null,"Se ha devuelto el libro");
					} else {
						JOptionPane.showMessageDialog(null,"No hay libros prestados");
					}
				} else if (pd == 2) {
					if (libro1.prestamo()) {
						JOptionPane.showMessageDialog(null,"Se ha prestado el libro");
					} else {
						JOptionPane.showMessageDialog(null,"No hay libros disponibles");
					}
				}
				
			
				JOptionPane.showMessageDialog(null,libro2.toString());
				 pd=libro2.leer("(1) Devolver (2) Prestamo");
				if(pd == 1) {
					if (libro2.devolucion()) {
						JOptionPane.showMessageDialog(null,"Se ha devuelto el libro");
					} else {
						JOptionPane.showMessageDialog(null,"No hay libros prestados");
					}
				} else if (pd == 2) {
					if (libro2.prestamo()) {
						JOptionPane.showMessageDialog(null,"Se ha prestado el libro");
					} else {
						JOptionPane.showMessageDialog(null,"No hay libros disponibles");
					}
				}
			
			rep=libro1.leerS("S/N");
			while (!rep.equalsIgnoreCase("S") && !rep.equalsIgnoreCase("N")) {
				rep=libro1.leerS("S/N");
			}
		} while(!rep.equalsIgnoreCase("N"));

	}

}
