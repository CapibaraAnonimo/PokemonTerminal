package pokemonTerminalModel;

public class Objetos {

	int precio;
	int tipo;//1.Curacion, 2.Revivir, 3.ataque, 4.ataqueEsp, 5.Defensa, 6.DefensaEsp, 7.Velocidad, 8.Precision
	int accion;
	/*int curacion;
	int revivir;
	int ataque;
	int ataqueEspecial;
	int defensa;
	int defensaEspecial;
	int velocidad;
	int precision;*/
	

	public Objetos(int precio, int tipo, int accion) {
		this.precio = precio;
		this.tipo = tipo;
		this.accion = accion;
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
