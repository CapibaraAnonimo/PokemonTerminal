package pokemonTerminalModel;
import pokemonTerminalCrud.CrudPokemon;


public class Equipo {

	int posicion=0;
	private CrudPokemon pokemon[]= new CrudPokemon[6];
	
	
	public Equipo(int posicion, CrudPokemon[] pokemon) {
		super();
		this.posicion = posicion;
		this.pokemon = pokemon;
	}


	public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	public CrudPokemon[] getPokemon() {
		return pokemon;
	}


	public void setPokemon(CrudPokemon[] pokemon) {
		this.pokemon = pokemon;
	}
	
	
	
	
	
	
	
}
