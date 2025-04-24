package ejfrutas2;

import java.util.ArrayList;
import java.util.Scanner;

import cargamento.fruta;

public class MainFruta {

	public static void main(String[] args) {
		final int ncarg = 10;
		//añadir comentario
		ArrayList<Integer> cargamentos = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		fruta cargamento[] = new fruta[ncarg];
		int opcion;
		String nombre, procedencia;
		double pventa = 0, pcoste, kilos, rebaja;
		Scanner sc = new Scanner(System.in);

		/*
		 * for (int i = 0; i < cargamento.length; i++) {
		 * System.out.println("Introduce nombre:"); nombre = sc.next();
		 * System.out.println("Introduce la procedencia"); procedencia = sc.next();
		 * System.out.println("Introduce los kilos:"); kilos = sc.nextDouble();
		 * System.out.println("Introduce el precio coste"); pcoste = sc.nextDouble();
		 * System.out.println("Introduce el precio venta"); pventa = sc.nextDouble();
		 * 
		 * }
		 */

		do {
			System.out.println("1. Dar de alta un cargamento\n2.Mostrar informacion de los cargamentos"
					+ "\n3.Rebajar cargamento\n4.Vender\n5.Borrar cargamentos vacios.\n6.Salir");
			opcion = sc.nextInt();
			switch (opcion) {

			// dar de alta un cargamento
			case 1:
				sc.next(); // limpiar
				if (u == ncarg)
					System.out.println("No se puede instroducir mas");
				else
					System.out.println("Introduce fruta:");
				nombre = sc.next();
				System.out.println("Introduce la procedencia");
				procedencia = sc.next();
				System.out.println("Introduce los kilos:");
				kilos = sc.nextDouble();
				System.out.println("Introduce el precio coste");
				pcoste = sc.nextDouble();
				System.out.println("Introduce el precio venta");
				pventa = sc.nextDouble();

				// construye el cargamento
				// u vale 0 en este cargamento, pero luego se suma para seguir a 1
				cargamentos.add(new Cargamento(nombre, procedencia, kilos, pcoste, pventa));
				break;
			// mostrar informacion del cargamento
			case 2:
				// coje desde el cargamento q es u, ya que tiene valor
				// .size para ver el tamaño
				for (int i = 0; i < cargamentos.size(); i++) {
					// .get para obtener el cargamento
					System.out.println(cargamentos.get(i).toString());
				}
				break;

			// rebajar cargamento
			case 3:
				sc.next();

				// hacer una funcion
				boolean encontrado = false;
				System.out.println("Introduce el nombre de la fruta");
				nombre = sc.next();
				System.out.println("Introduce la procedencia");
				procedencia = sc.next();
				
				fruta buscar = new fruta (nombre, procedencia);
				int pos = cargamentos.indexOf(buscar);
				
				if (pos==-1)
						System.out.println("No se encontro");
				else {
						System.out.println("Introduce la rebaja que se hará");
						rebaja = sc.nextDouble();
						if (cargamentos.get(pos).rebajar(i))
							System.out.println("Rebaja realizada");
						else
							System.out.println("No se puede rebajar");
						encontrado = true;
						break;
					}
				}
				if (!encontrado)
					System.out.println("no se encontró");
				break;

			// vender
			case 4:
				System.out.println("Introduce el nombre de la fruta");
				nombre = sc.next();
				
				// buscar
				break;
			case 5:
				for (int i = 0; i < cargamentos.size(); i++) {
					System.out.println("Se borra los cargamentos q hay 0");
					nombre = sc.next();
					if (cargamentos.get(i).getKilos() == 0) {
				//para borrarlo
						cargamentos.remove(i);
						//para que se borre y se mueva para q se pueda borrar todo
						i--;
					}
				}
				break;
			}

		} while (opcion != 6);

		System.out.println("Beneficio del almacén:" + fruta.getBeneficio());
	}

}
