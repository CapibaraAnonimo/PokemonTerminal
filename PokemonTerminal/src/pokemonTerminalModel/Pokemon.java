package pokemonTerminalModel;

public class Pokemon {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private int id;
	
	private int mv1;
	private int mv2;
	private int mv3;
	private int mv4;
	
	private int tipo;
	
	private int vida;
	private int ataque;
	private int defensa;
	private int defensaEspecial;
	private int ataqueEspecial;
	private int velocidad;
	private int precision;
	private int evasion;
	
	
	
	public Pokemon(int id, int mv1, int mv2, int mv3, int mv4, int tipo, int vida, int ataque, int defensa,
			int defensaEspecial, int ataqueEspecial, int velocidad, int precision, int evasion) {
		this.id = id;
		this.mv1 = mv1;
		this.mv2 = mv2;
		this.mv3 = mv3;
		this.mv4 = mv4;
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



	public int getMv1() {
		return mv1;
	}



	public void setMv1(int mv1) {
		this.mv1 = mv1;
	}



	public int getMv2() {
		return mv2;
	}



	public void setMv2(int mv2) {
		this.mv2 = mv2;
	}



	public int getMv3() {
		return mv3;
	}



	public void setMv3(int mv3) {
		this.mv3 = mv3;
	}



	public int getMv4() {
		return mv4;
	}



	public void setMv4(int mv4) {
		this.mv4 = mv4;
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