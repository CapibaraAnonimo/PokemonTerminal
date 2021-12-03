package pokemonTerminalModel;

public class Pokemon {

	private int id;
	private String nombre;
	private int nivel = 50;

	private int tipo;

	private int vida;
	private int vida0;
	private int ataque;
	private int defensa;
	private int defensaEspecial;
	private int ataqueEspecial;
	private int velocidad;
	private int precision = 100;
	private int evasion = 100;
	private Movimiento movimientos[] = { new Movimiento(22, "Látigo Cepa", 11, 45, 100, 25, 0),
			new Movimiento(22, "Látigo Cepa", 11, 45, 100, 25, 0),
			new Movimiento(22, "Látigo Cepa", 11, 45, 100, 25, 0),
			new Movimiento(22, "Látigo Cepa", 11, 45, 100, 25, 0) };

	public Pokemon(int id, String nombre, int tipo, int vida, int ataque, int defensa, int defensaEspecial, int ataqueEspecial,
			int velocidad) {

		this.id = id;
		this.nombre = nombre;
		this.vida0=vida;
		this.tipo = tipo;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.defensaEspecial = defensaEspecial;
		this.ataqueEspecial = ataqueEspecial;
		this.velocidad = velocidad;
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
	
	public int getNivel() {
		return nivel;
	}
		
	public int getVida0() {
		return vida0;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getDefensaEspecial() {
		return defensaEspecial;
	}

	public void setDefensaEspecial(int defensaEspecial) {
		this.defensaEspecial = defensaEspecial;
	}

	public int getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(int ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public int getEvasion() {
		return evasion;
	}

	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}

	public Movimiento getMovimiento(int posicion) {
		return movimientos[posicion];
	}

	public void setMovimiento(Movimiento mov, int posicion) {
		this.movimientos[posicion] = mov;
	}

}