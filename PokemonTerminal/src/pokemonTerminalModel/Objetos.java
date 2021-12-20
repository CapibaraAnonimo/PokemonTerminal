package pokemonTerminalModel;

public class Objetos {

	int id;
	int cantidad;
	String nombre;
	int precio;
	int tipo;//1.Curacion(Ana), 2.Revivir, 3.ataque, 4.ataqueEsp, 5.Defensa, 6.DefensaEsp(Ana), 7.Velocidad(Ana), 8.Precision(Ana)
	int accion;
	

	public Objetos(int id, String nombre ,int precio, int tipo, int accion, int cantidad) {
		this.id= id;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
		this.accion = accion;
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public int getAccion() {
		return accion;
	}


	public void setAccion(int accion) {
		this.accion = accion;
	}


	public String toString() {
		return "nombre: " + nombre + "\n" +
		"precio: " + precio;
	}
	
	
	
	
}
