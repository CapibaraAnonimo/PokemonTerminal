package pokemonTerminalModel;

public class Movimiento {
	
	int id = 0;
	String nombre = new String();
	int tipo = 0;      //Los tipos empezaran por 0 y el orden de tipos será normal, lucha, volador,
	int poder = 0;      //veneno, tierra, roca, bicho, fantasma, acero, fuego, agua, planta, electrico,
	int precision = 0;  //psiquico, hielo, dragon, oscuro, hada.
	int pp = 0;
	int categoria = 0; //fisico 0, especial 1, estado 2;
	int ataque = 0;
	int ataqueEsp = 0;
	int defensa = 0;
	int defensaEsp = 0;
	
	public Movimiento(int id, String nombre, int tipo, int poder, int precision, int pp, int categoria, 
		int ataque, int ataqueEsp, int defensa, int defensaEsp) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.poder = poder;
		this.precision = precision;
		this.pp = pp;
		this.categoria = categoria;
		this.ataque = ataque;
		this.ataqueEsp = ataqueEsp;
		this.defensa = defensa;
		this.defensaEsp = defensaEsp;
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

	public int getTipo() {
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
