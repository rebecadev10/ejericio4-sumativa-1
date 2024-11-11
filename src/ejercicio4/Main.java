package ejercicio4;
//Ejercicio 1 actividad sumativa 3 Rebeca Rodriguez
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda(1, "Mundo Computer", "Rebeca", "Los Teques");

        // Muestra los datos iniciales de la tienda y el mensaje de bienvenida una vez
        tienda.imprimirDatosTienda();
        tienda.mensajeBienvenida();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Bucle principal del menú
        while (continuar) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Agregar computadora");
            System.out.println("2. Imprimir listado de computadoras");
            System.out.println("3. Eliminar computadora");
            System.out.println("4. Buscar una computadora");
            System.out.println("5. Salir");
            System.out.print("Ingresa el número de la opción que deseas hacer: ");
            int opcionMenu = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            // Ejecutar la opción elegida por el usuario
            tienda.menu(opcionMenu);

            // Salir si el usuario elige la opción de salida
            if (opcionMenu == 5) {
                continuar = false;
                System.out.println("¡Hasta pronto!");
            }
        }

        scanner.close(); // Cerramos el scanner al final
    }
}
