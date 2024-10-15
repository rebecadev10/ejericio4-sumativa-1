package ejercicio4;

import java.util.Scanner;
//esta es nuestra clase hija computadora, se realizo de esta forma ya que la tienda puede tener distintos productos, como accesorios, repuestos etc
public class Computadora extends Productos {
//	creamos nuestros atributos
	private String modelo;
	private String marca;
	private String tipoMemoria;
	private int capacidadMemoria;
	private String tipoDisco;
	private int capacidadDisco;
	private String tipoProcesador;
	private int nucleos;
	private int cantHilos;
	private double frecuencia;
	private String arquitectura;
	private String sistemaOperativo;
	private double precioCosto;
	private double precioVenta;
	
	// Constructor por defecto
	public Computadora(
			int id,
			String nombre,
			String categoria,
			String modelo,
			String marca,
			String tipoMemoria, 
			int capacidadMemoria,
			String tipoDisco,
			int capacidadDisco,
			String tipoProcesador,
			int nucleos,
			int cantHilos,
			double frecuencia,
			String arquitectura,
			String sistemaOperativo,
			double precioCosto,
			double precioVenta 
			) {
		// Llamada al constructor de Productos 
		super(id,nombre, categoria);
		
		this.modelo=modelo;
		this.marca=marca;
		this.tipoMemoria=tipoMemoria;
		this.capacidadMemoria=capacidadMemoria;
		this.tipoDisco=tipoDisco;
		this.capacidadDisco=capacidadDisco;
		this.tipoProcesador=tipoProcesador;
		this.nucleos=nucleos;
		this.cantHilos=cantHilos;
		this.frecuencia=frecuencia;
		this.arquitectura=arquitectura;
		this.sistemaOperativo=sistemaOperativo;
		this.precioCosto=precioCosto;
		this.precioVenta=precioVenta;
	}

	// Método para registrar los datos de la computadora, aplicamos lo aprendido en clase para el ingreso de datos 
	public void registrarComputadora() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Formulario de registro de computadora:");
		System.out.print("Marca: ");
		this.marca = scanner.nextLine();

		System.out.print("Modelo: ");
		this.modelo = scanner.nextLine();

		System.out.print("Tipo de memoria: ");
		this.tipoMemoria = scanner.nextLine();

		System.out.print("Capacidad de la memoria (GB): ");
		this.capacidadMemoria = scanner.nextInt();
		scanner.nextLine(); // Consumimos el salto de línea
		System.out.print("Tipo de disco: ");
		this.tipoDisco = scanner.nextLine();

		System.out.print("Capacidad del disco (GB): ");
		this.capacidadDisco = scanner.nextInt();
		
		scanner.nextLine(); // Consumimos el salto de línea
		System.out.print("Tipo de procesador: ");
		this.tipoProcesador = scanner.nextLine();

		System.out.print("Cantidad de núcleos: ");
		this.nucleos = scanner.nextInt();
		scanner.nextLine(); // Consumimos el salto de línea
		System.out.print("Cantidad de hilos: ");
		this.cantHilos = scanner.nextInt();

		System.out.print("Frecuencia (GHz): ");
		this.frecuencia = scanner.nextDouble();
		scanner.nextLine(); // Consumimos el salto de línea

		System.out.print("Arquitectura: ");
		this.arquitectura = scanner.nextLine();

		System.out.print("Sistema operativo: ");
		this.sistemaOperativo = scanner.nextLine();

		System.out.print("Precio costo: ");
		this.precioCosto = scanner.nextDouble();

		System.out.print("Precio de venta: ");
		this.precioVenta = scanner.nextDouble();

		System.out.println("¡Registro de computadora exitoso!");
	}

	// Método para imprimir la información registrada :)
	public void imprimirListadoComputadoras() {
		System.out.println(" ");
		System.out.println("----- Información de la computadora registrada -----");
		System.out.println(" ");
		System.out.println("ID Producto: "+this.getId()+"          nombre: "+this.nombre+"      Categoria: "+this.categoria);
		System.out.println("Marca: " + this.marca+ "                                  Modelo: " + this.modelo);
		System.out.println("Tipo de memoria: " + this.tipoMemoria+"                             Capacidad de memoria: " + this.capacidadMemoria + " GB");
		System.out.println("Tipo de disco: " + this.tipoDisco+"                                Capacidad del disco: " + this.capacidadDisco + " GB");
		System.out.println("Tipo de procesador: " + this.tipoProcesador+"     Núcleos: " + this.nucleos+"     Hilos: " + this.cantHilos);
		System.out.println("Frecuencia: " + this.frecuencia + " GHz"+"      Arquitectura: " + this.arquitectura+"    Sistema operativo: " + this.sistemaOperativo);
		System.out.println("Precio de costo: $" + this.precioCosto);
		System.out.println("Precio de venta: $" + this.precioVenta);
		System.out.println(" ");
	}
}
