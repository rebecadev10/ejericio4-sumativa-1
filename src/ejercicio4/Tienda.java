/**
 * 
 */
package ejercicio4;

/**
 * 
 */
public class Tienda {
//	atributos de mi clase Tienda lo declaramos privados y luego agregamos los setters y getters. :)
	private int id;
	private String nombre;
	private String propietario;
	private String ubicacion;
	
	/**
	 * 
	 */
	public Tienda(int id,String nombre,String propietario,String ubicacion) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.nombre=nombre;
		this.propietario=propietario;
		this.ubicacion=ubicacion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
//	creamos el metodo para imprimir informacion basica de nuestra tiendaa, por el momento se le asignan los valores 
	public void imprimirDatosTienda() {
		System.out.println("");//salto de linea
		System.out.println("Nombre de la tienda: " + getNombre() +"  Propietario: "+getPropietario());
		System.out.println("Ubicacion: "+ getUbicacion());
		
	}

}
