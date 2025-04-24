import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class fiche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los nombres de las dos carpetas.
        System.out.println("Introduce la ruta de la primera carpeta:");
        String rutaCarpeta1 = sc.nextLine();

        System.out.println("Introduce la ruta de la segunda carpeta:");
        String rutaCarpeta2 = sc.nextLine();

        // HashSet para almacenar los nombres de archivos únicos
        HashSet<String> archivosUnicos = new HashSet<>();

        // Procesar la primera carpeta
        File carpeta1 = new File(rutaCarpeta1);
        if (carpeta1.exists() && carpeta1.isDirectory()) {
            for (File archivo : carpeta1.listFiles()) {
                if (archivo.isFile()) {
                    archivosUnicos.add(archivo.getName()); // Agregar el archivo al conjunto
                }
            }
        } else {
            System.out.println("La ruta de la primera carpeta no es válida.");
        }

        // Procesar la segunda carpeta
        File carpeta2 = new File(rutaCarpeta2);
        if (carpeta2.exists() && carpeta2.isDirectory()) {
            for (File archivo : carpeta2.listFiles()) {
                if (archivo.isFile()) {
                    archivosUnicos.add(archivo.getName()); // Agregar el archivo al conjunto
                }		
            }
        } else {
            System.out.println("La ruta de la segunda carpeta no es válida.");
        }

        // Mostrar los archivos únicos
        System.out.println("Archivos únicos contenidos en las carpetas:");
        for (String nombreArchivo : archivosUnicos) {
            System.out.print(nombreArchivo + ", ");
        }
    }
}


