package pokemonTerminalModel;

public class Objetos {

	int id;
	int precio;
	int tipo;//1.Curacion(Ana), 2.Revivir, 3.ataque, 4.ataqueEsp, 5.Defensa, 6.DefensaEsp(Ana), 7.Velocidad(Ana), 8.Precision(Ana)
	int accion;
	/*int curacion;
	int revivir;
	int ataque;
	int ataqueEspecial;
	int defensa;
	int defensaEspecial;
	int velocidad;
	int precision;*/
	

	public Objetos(int id, int precio, int tipo, int accion) {
		this.id= id;
		this.precio = precio;
		this.tipo = tipo;
		this.accion = accion;
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


	
	
	
	
	
}
