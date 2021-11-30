package pokemonTerminalModel;


public class Pokemon {

	
	private int id;
	
	private int tipo;
	
	private int vida;
	private int ataque;
	private int defensa;
	private int defensaEspecial;
	private int ataqueEspecial;
	private int velocidad;
	private int precision;
	private int evasion;
	private Movimiento mv1 = null;
	private Movimiento mv2 = null;
	private Movimiento mv3 = null;
	private Movimiento mv4 = null;
	
	
	public Pokemon(int id, int tipo, int vida, int ataque, int defensa, int defensaEspecial, int ataqueEspecial,
			int velocidad, int precision, int evasion) {

		this.id = id;
		this.tipo = tipo;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.defensaEspecial = defensaEspecial;
		this.ataqueEspecial = ataqueEspecial;
		this.velocidad = velocidad;
		this.precision = precision;
		this.evasion = evasion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
	
	
	




	
	
	
}