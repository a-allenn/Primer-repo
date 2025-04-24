package wallapop;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int oo;
		String cat, email, op, cod, fecha;
		double precio;
		int produ = 10;
		Producto produc[]=new Producto [produ];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Opciones:");
		do {
		System.out.println("1.Dar de alta un anuncio\n2.Comprar un producto\n"
							+ "3.Mostrar valoracion\n4.Productos vendidos\n5.Salir");
		oo = sc.nextInt();
			
			switch(oo) {
			case 1:
				System.out.println("Dar de alta un anuncio.");
				System.out.println("Introduce los datos:");
				
				System.out.println("Fecha (aaaa-mm-dd)");
				fecha = sc.next();
				
				System.out.println("Lista");
				System.out.println("\t Libros \n\t Moda \n\t Coches \n\t Telefonia \n\t Electrodomesticos \n\t Pisos \n\t Otro ");
				do {
				System.out.println("Categoria");
				cat = sc.next();
				if (!cat.equalsIgnoreCase("Pisos") && !cat.equalsIgnoreCase("Coches")) {
				System.out.println("Tiene envio? (si/no)");
				op = sc.next();
				}
				}while (!cat.equalsIgnoreCase("Libros") || !cat.equalsIgnoreCase("Moda") || !cat.equalsIgnoreCase("Coches") || !cat.equalsIgnoreCase("Telefonia") || !cat.equalsIgnoreCase("Electrodomesticos") || !cat.equalsIgnoreCase("Pisos") || !cat.equalsIgnoreCase("Otro"));
				
				do {
				System.out.println("Precio");
				precio = sc.nextDouble();
				}while (precio < 0);
				do {
				System.out.println("Correo");
				email = sc.next();
				}while (!email.matches(""));
				break;
				
			case 2:
				System.out.println("Comprar un producto.");
				System.out.println("Anota la categoria del producto:");
				cat = sc.next();
				System.out.println("Precio maximo a pagar");
				precio = sc.nextDouble();
				System.out.println("Quieres ordenar los anuncios? (1ro envio)");
				op = sc.next();
				System.out.println("Introduce el codigo del producto");
				cod = sc.next();
				break;
			case 3:
				System.out.println("Valoracion media de cada vendedor");
				break;
			case 4:
				System.out.println("Productos vendidos:");
			}
		} while (oo !=5);
	}
}
