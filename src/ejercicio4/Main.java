/**Ejercicio numero 4 tienda de computadoras Rebeca rodriguez CI:30.051.282 Programacion II UBA SAN ANTONIO DE LOS ALTOS
 * 
 */
package ejercicio4;

/**
 * 
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		creamos nuestro objeto de la tienda, productos y computadoras
		
		Tienda tienda=new Tienda(1,"Mundo Computer","Rebeca","Los Teques");
		// Creamos los objeto de la clase Computadora y registramos sus atributos
				Computadora computadora = new Computadora(1, "computadora1 ", "Computadora ", " "," ", " ",0, " ", 8, " ", 0, 16, 3.6, " ", " ", 800.00, 1000.00);
				Computadora computadora1 = new Computadora(2, "computadora2 ","Computadora","Dell", "Inspiron", "DDR4", 16, "SSD", 512, "Intel Core i7", 8,  16, 3.6, "x64", "Windows 10", 800.00, 1000.00);
				Computadora computadora2 = new Computadora(3, " computadora3","Computadora","MSI", "Raider", "DDR5", 32, "SSD", 1024, "AMD Ryzen 9", 12, 24, 4.2, "x64", "Windows 11", 1500.00, 1800.00); 
				Computadora computadora3 = new Computadora(4, " computadora4","Computadora","Apple", "MacBook Pro", "LPDDR4X",16, "SSD", 512, "Apple M1", 8, 8, 3.2, "ARM", "macOS Monterey", 1200.00, 1400.00);
				Computadora computadora4 = new Computadora(5," computadora5","Computadora", "HP", "ZBook Studio", "DDR4",64, "SSD", 2048, "Intel Xeon", 8, 16, 3.8, "x64", "Windows 11 Pro", 2500.00, 3000.00);
				
				
//				solamente este objeto sera actualizado con los valores que inserte el usuario
				computadora.registrarComputadora();
				
				// Imprimimos la información de la computadora registrada
				tienda.imprimirDatosTienda();
				computadora.imprimirListadoComputadoras();
				computadora1.imprimirListadoComputadoras();
				computadora2.imprimirListadoComputadoras();
				computadora3.imprimirListadoComputadoras();
				computadora4.imprimirListadoComputadoras();
//				ya imprimimos todas las computadoras registradas, ya sea por ingreso de teclado, o la creacion del objeto directamente, implementamos una nueva funcion para eliminar una computadora validando su id y marca 
				computadora1.eliminarComputadora(2,"Inspiron");
//				imprimimos nuevamente la computadora 1 si ingresamos correctamente el id y la marca debe indicar que esta computadora ha sido eliminada
				computadora1.imprimirListadoComputadoras();
		
	}

}
