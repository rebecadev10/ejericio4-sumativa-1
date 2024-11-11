package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Computadora extends Productos {
    // Atributos de Computadora
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
    // Lista para almacenar computadoras registradas
    private static ArrayList<Computadora> listaComputadoras = new ArrayList<>();


    // Constructor
    public Computadora(
			
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
		super(nombre, categoria);
		
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
    
    
    public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTipoMemoria() {
		return tipoMemoria;
	}


	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}


	public int getCapacidadMemoria() {
		return capacidadMemoria;
	}


	public void setCapacidadMemoria(int capacidadMemoria) {
		this.capacidadMemoria = capacidadMemoria;
	}


	public String getTipoDisco() {
		return tipoDisco;
	}


	public void setTipoDisco(String tipoDisco) {
		this.tipoDisco = tipoDisco;
	}


	public int getCapacidadDisco() {
		return capacidadDisco;
	}


	public void setCapacidadDisco(int capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}


	public String getTipoProcesador() {
		return tipoProcesador;
	}


	public void setTipoProcesador(String tipoProcesador) {
		this.tipoProcesador = tipoProcesador;
	}


	public int getNucleos() {
		return nucleos;
	}


	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}


	public int getCantHilos() {
		return cantHilos;
	}


	public void setCantHilos(int cantHilos) {
		this.cantHilos = cantHilos;
	}


	public double getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}


	public String getArquitectura() {
		return arquitectura;
	}


	public void setArquitectura(String arquitectura) {
		this.arquitectura = arquitectura;
	}


	public String getSistemaOperativo() {
		return sistemaOperativo;
	}


	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}


	public double getPrecioCosto() {
		return precioCosto;
	}


	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public static ArrayList<Computadora> getListaComputadoras() {
		return listaComputadoras;
	}


	public static void setListaComputadoras(ArrayList<Computadora> listaComputadoras) {
		Computadora.listaComputadoras = listaComputadoras;
	}


	// Método para registrar computadora
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
        scanner.nextLine();

        System.out.print("Tipo de procesador: ");
        this.tipoProcesador = scanner.nextLine();

        System.out.print("Cantidad de núcleos: ");
        this.nucleos = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Cantidad de hilos: ");
        this.cantHilos = scanner.nextInt();

        System.out.print("Frecuencia (GHz): ");
        this.frecuencia = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Arquitectura: ");
        this.arquitectura = scanner.nextLine();

        System.out.print("Sistema operativo: ");
        this.sistemaOperativo = scanner.nextLine();

        System.out.print("Precio costo: ");
        this.precioCosto = scanner.nextDouble();

        System.out.print("Precio de venta: ");
        this.precioVenta = scanner.nextDouble();
        System.out.println(" ");
        System.out.println("___________________________________________________________________ ");
        System.out.println(" ");
        System.out.println("¡Registro de computadora exitoso!");
        // Crear una nueva instancia de computadora con los datos ingresados
        Computadora nuevaCompu = new Computadora("cmputadora #"+contadorID,"Computadores" ,modelo,marca,tipoMemoria,capacidadMemoria,tipoDisco,capacidadDisco,tipoProcesador,nucleos,cantHilos,frecuencia,arquitectura,sistemaOperativo,precioCosto,precioVenta);

        // Agregar la computadora a la lista
        listaComputadoras.add(nuevaCompu);
    }
   
  
    // Método toString para mostrar información
    @Override
    public String toString() {
        return "Computadora{" +
                "ID: " + getId() +
                ", Nombre: " + getNombre() +
                ", Marca: " + marca +
                ", Modelo: " + modelo +
                ", Tipo de Memoria: " + tipoMemoria +
                ", Capacidad de Memoria: " + capacidadMemoria + " GB" +
                ", Tipo de Disco: " + tipoDisco +
                ", Capacidad de Disco: " + capacidadDisco + " GB" +
                ", Procesador: " + tipoProcesador +
                ", Núcleos: " + nucleos +
                ", Hilos: " + cantHilos +
                ", Frecuencia: " + frecuencia + " GHz" +
                ", Arquitectura: " + arquitectura +
                ", Sistema Operativo: " + sistemaOperativo +
                ", Precio Costo: " + precioCosto +" $"+
                ", Precio Venta: " + precioVenta +" $"+
                "}";
    }


	public static void imprimirListadoComputadoras() {
		// TODO Auto-generated method stub
		if (listaComputadoras.isEmpty()) {
			System.out.println(" ");
	        System.out.println("___________________________________________________________________ ");
		    System.out.println("No hay computadoras registradas.");
		} else {
		for (Computadora computadora : listaComputadoras) {
			System.out.println(" ");
			System.out.println("----- Información de la computadora registrada -----");
			System.out.println(" ");
			System.out.println("ID Producto: "+computadora.id+"          nombre: "+computadora.nombre+"      Categoria: "+computadora.categoria);
			System.out.println("Marca: " + computadora.marca+ "                                  Modelo: " + computadora.modelo);
			System.out.println("Tipo de memoria: " + computadora.tipoMemoria+"                             Capacidad de memoria: " + computadora.capacidadMemoria + " GB");
			System.out.println("Tipo de disco: " + computadora.tipoDisco+"                                Capacidad del disco: " + computadora.capacidadDisco + " GB");
			System.out.println("Tipo de procesador: " + computadora.tipoProcesador+"     Núcleos: " + computadora.nucleos+"     Hilos: " + computadora.cantHilos);
			System.out.println("Frecuencia: " + computadora.frecuencia + " GHz"+"      Arquitectura: " + computadora.arquitectura+"    Sistema operativo: " + computadora.sistemaOperativo);
			System.out.println("Precio de costo: " + computadora.precioCosto+ " $");
			System.out.println("Precio de venta: " + computadora.precioVenta +" $");
			System.out.println(" ");
			System.out.println("__________________________________________________________________________________________ ");
	    	}	}
	}
	public static void eliminarComputadora(int id, String marca) {
	    // Buscamos la computadora en la lista de computadoras
	    Computadora computadoraAEliminar = null;
	    
	    for (Computadora comp : listaComputadoras) {
	        // Verificamos si el id y la marca coinciden
	        if (comp.getId() == id && comp.getMarca().equals(marca)) {
	            computadoraAEliminar = comp;
	            break;
	        }
	    }

	    if (computadoraAEliminar != null) {
	        // Eliminamos la computadora de la lista
	        listaComputadoras.remove(computadoraAEliminar);
	        System.out.println(" ");
	        System.out.println("___________________________________________________________________ ");
	        System.out.println("Computadora con ID " + id + " y marca " + marca + " fue eliminada exitosamente.");
	        System.out.println(" ");
	        System.out.println("___________________________________________________________________ ");
	    } else {
	        // Si no se encuentra la computadora
	    	System.out.println(" ");
	        System.out.println("___________________________________________________________________ ");
	        System.out.println("No se encontró ninguna computadora con el ID y marca especificados.");
	    }
	}
	public void buscarPorMarca(String marca) {
	    boolean encontrada = false;

	    for (Computadora computadora : listaComputadoras) {
	        if (computadora.getMarca().equalsIgnoreCase(marca)) {
	            System.out.println("\n----- Información de la computadora registrada -----\n");
	            System.out.println("ID Producto: " + computadora.getId() + "  Nombre: " + computadora.getNombre() + "  Categoria: " + computadora.getCategoria());
	            System.out.println("Marca: " + computadora.getMarca() + "  Modelo: " + computadora.getModelo());
	            System.out.println("Tipo de memoria: " + computadora.getTipoMemoria() + "  Capacidad de memoria: " + computadora.getCapacidadMemoria() + " GB");
	            System.out.println("Tipo de disco: " + computadora.getTipoDisco() + "  Capacidad del disco: " + computadora.getCapacidadDisco() + " GB");
	            System.out.println("Procesador: " + computadora.getTipoProcesador() + "  Núcleos: " + computadora.getNucleos() + "  Hilos: " + computadora.getCantHilos());
	            System.out.println("Frecuencia: " + computadora.getFrecuencia() + " GHz  Arquitectura: " + computadora.getArquitectura() + "  Sistema operativo: " + computadora.getSistemaOperativo());
	            System.out.println("Precio de costo: " + computadora.getPrecioCosto() + " $  Precio de venta: " + computadora.getPrecioVenta() + " $\n");
	            System.out.println("__________________________________________________________________________________________\n");
	            encontrada = true;
	        }
	    }

	    if (!encontrada) {
	        System.out.println("No se encontraron computadoras con la marca " + marca);
	    }
	}


}

