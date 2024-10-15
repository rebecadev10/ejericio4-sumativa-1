/**
 * 
 */
package ejercicio4;
import java.util.Scanner;
/**
 * 
 */
public class Productos {
//	creamos nuestros atributos de forma protegida para que las clases hijas puedan acceder a ellos 
    protected int id;
    protected String nombre;
    protected String categoria;

    public Productos(int id, String nombre, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

	
	


}

