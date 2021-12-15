package pokemonTerminalModel;

public class Movimiento {

	private int id = 0;
	private String nombre = new String();
	private int tipo = 0; // Los tipos empezaran por 0 y el orden de tipos ser  0.normal , 1.lucha , 2.volador ,
	private int poder = 0; // 3.veneno , 4.tierra  , 5.roca , 6.bicho , 7.fantasma , 8.acero , 9.fuego , 10.agua , 11.planta , 12.electrico ,
	private int precision = 0; // 13.psiquico , 14.hielo , 15.dragon , 16.oscuro , 17.hada .
	private int pp = 0; // Cantidad de veces que se puede usar el movimiento
	private int categoria = 0; // físico 1, especial 2, estado 3, condiciónEstado 4;
	private int ataque = 0;
	private int ataqueEsp = 0;
	private int defensa = 0;
	private int defensaEsp = 0;
	private int condicionEstado = 0; // quemado 0, congelación 1, paralisis 2, enveneado 3, dormido 4,
	private int probEstado = 0;

	// Constructor para movimientos sin cambios
	public Movimiento(int id, String nombre, int tipo, int poder, int precision, int pp, int categoria) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.poder = poder;
		this.precision = precision;
		this.pp = pp;
		this.categoria = categoria;
	}

	// Constructor para movimientos con cambios de estadisticas
	public Movimiento(int id, String nombre, int tipo, int poder, int precision, int pp, int categoria, int ataque,
			int ataqueEsp, int defensa, int defensaEsp) {
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

	// Constructor para movimientos que modifican la condición de estado
	public Movimiento(int id, String nombre, int tipo, int poder, int precision, int pp, int categoria,
			int condicionEstado, int probEstado) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.poder = poder;
		this.precision = precision;
		this.pp = pp;
		this.categoria = categoria;
		this.condicionEstado = condicionEstado;
		this.probEstado = probEstado;
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

	public int getAtaque() {
		return ataque;
	}

	public int getAtaqueEsp() {
		return ataqueEsp;
	}

	public int getDefensa() {
		return defensa;
	}

	public int getDefensaEsp() {
		return defensaEsp;
	}

	public int getCondicionEstado() {
		return condicionEstado;
	}

	public int getProbEstado() {
		return probEstado;
	}

}
