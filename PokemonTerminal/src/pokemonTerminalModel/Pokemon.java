package pokemonTerminalModel;

import pokemonTerminalCrud.CrudMovimientos;
import pokemonTerminalDatos.TablaTipos;

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
	private CrudMovimientos movimientos[] = new CrudMovimientos[4];
	private int stage = 0;
	private String sprite[];

	public Pokemon(int id, String nombre, int tipo, int vida, int ataque, int defensa, int defensaEspecial, int ataqueEspecial,
			int velocidad, CrudMovimientos movimientos[] ,String sprite[]) {

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
		this.movimientos= movimientos;
		this.sprite = sprite;
	}
	
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}


	public CrudMovimientos[] getMovimientos() {
		return movimientos;
	}



	public void setMovimientos(CrudMovimientos[] movimientos) {
		this.movimientos = movimientos;
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

	public CrudMovimientos getMovimiento(int posicion) {
		return movimientos[posicion];
	}

	public void setMovimiento(CrudMovimientos mov, int posicion) {
		this.movimientos[posicion] = mov;
	}
	
	public int getStage() {
		return stage;
	}
	
	public void setStage(int stage) {
		this.stage = stage;
	}
	
	public String[] getSprite() {
		return sprite;
	}
	
	@Override
	public String toString() {
		return "ID: " + id +"\n" +
			   "Nombre: " + nombre + "\n" +
			   "Nivel: " + nivel + "\n" +
			   "Tipo: " + TablaTipos.getTipo(tipo) + "\n" +
			   "Vida: " + vida0 + "\n" +
			   "Ataque: " + ataque + "\t\tAtaque Especial: " + ataqueEspecial + "\n" +
			   "Defensa: " + defensa + "\t\tDefensa Especial: " + defensaEspecial + "\n" +
			   "Velocidad: " + velocidad + "\n" +
			   "Precisión: " + precision + "\n" +
			   "Evasión: " + evasion + "\n";
	}

}