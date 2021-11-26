package pokemonTerminalModel;

public class Pokemon {

	private int vida;
	private int ataque;
	private int defensa;
	private int defensaEspecial;
	private int especial;
	private int velocidad;
	private int precision;
	private int evasion;
	
	
	
	
	public Pokemon(int vida, int ataque, int defensa, int defensaEspecial, int especial, int velocidad, int precision,
			int evasion) {
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.defensaEspecial = defensaEspecial;
		this.especial = especial;
		this.velocidad = velocidad;
		this.precision = precision;
		this.evasion = evasion;
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


	public int getEspecial() {
		return especial;
	}


	public void setEspecial(int especial) {
		this.especial = especial;
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
