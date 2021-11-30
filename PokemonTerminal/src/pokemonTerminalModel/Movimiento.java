package pokemonTerminalModel;

public class Movimiento {
	
	int id = 0;
	String nombre = new String();
	byte tipo = 0;
	int poder = 0;
	int precision = 0;
	int pp = 0;
	byte categoria = 0;
	
	public Movimiento(int id, String nombre, byte tipo, int poder, int precision, int pp, byte categoria) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.poder = poder;
		this.precision = precision;
		this.pp = pp;
		this.categoria = categoria;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public byte getTipo() {
		return tipo;
	}

	public int getPoder() {
		return poder;
	}

	public int getPrecision() {
		return precision;
	}
	
	public int getCategoria() {
		return categoria;
	}
	
	
}
