package pokemonTerminalModel;
import pokemonTerminalCrud.CrudPokemon;


public class Equipo {
	
	private int posicion = 0;
	private CrudPokemon pokemons []= new CrudPokemon[6];
	
	
	public Equipo(CrudPokemon[] pokemon) {
		this.pokemons = pokemon;
	}
	
	public Equipo(CrudPokemon p1, CrudPokemon p2, CrudPokemon p3, CrudPokemon p4, CrudPokemon p5, CrudPokemon p6) {
		pokemons[1] = p1;
		pokemons[2] = p2;
		pokemons[3] = p3;
		pokemons[4] = p4;
		pokemons[5] = p5;
		pokemons[6] = p6;
	}

	public CrudPokemon[] getPokemons() {
		return pokemons;
	}
	
	public CrudPokemon getPokemon(int i) {
		return pokemons[i-1];
	}


	public void setPokemon(CrudPokemon[] pokemons) {
		this.pokemons = pokemons;
	}
	
	public void setPokemon(CrudPokemon pokemon, int i) {
		this.pokemons[i] = pokemon;
	}
	
	public int getPosicion() {
		return posicion;
	}
	
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	
	
}