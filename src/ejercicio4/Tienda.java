package ejercicio4;

import java.util.Scanner;

public class Tienda {
    private int id;
    private String nombre;
    private String propietario;
    private String ubicacion;
    

    // Constructor
    public Tienda(int id, String nombre, String propietario, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPropietario() { return propietario; }
    public void setPropietario(String propietario) { this.propietario = propietario; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    // Método para imprimir información básica de la tienda
    public void imprimirDatosTienda() {
        System.out.println("");
        System.out.println("Nombre de la tienda: " + getNombre() + "  Propietario: " + getPropietario());
        System.out.println("Ubicación: " + getUbicacion());
    }

    // Método para mostrar el mensaje de bienvenida y las opciones del menú
    public void mensajeBienvenida() {
        System.out.println("Bienvenida a nuestra tienda");
        System.out.println("    ____________________    ");
     
    }

    // Método del menú con opciones
    public void menu(int opcion) {
        Scanner scanner = new Scanner(System.in);
        
        Computadora computadora = new Computadora("Default", "Default", "Default", "Default", "Default", 0, "Default", 0, "Default", 0, 0, 0.0, "Default", "Default", 0.0, 0.0);

       
            


            switch (opcion) {
                case 1:
                    computadora.registrarComputadora();
                    break;
                case 2:
                    computadora.imprimirListadoComputadoras();
                    break;
                case 3:
                    System.out.print("Ingresa ID de la computadora a eliminar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingresa marca de la computadora a eliminar: ");
                    String marca = scanner.nextLine();
                    computadora.eliminarComputadora(id, marca);
                    break;
                case 4:
                    System.out.print("Ingresa la marca de computadora que estás buscando: ");
                    String marcaComputadora = scanner.nextLine();
                    computadora.buscarPorMarca(marcaComputadora);
                    break;
                case 5:
                    System.out.println("Gracias por visitar nuestra tienda. ¡Esperamos que regrese pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        
    }

}
