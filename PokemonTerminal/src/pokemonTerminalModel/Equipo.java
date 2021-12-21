package pokemonTerminalModel;
import pokemonTerminalCrud.CrudObjetos;
import pokemonTerminalCrud.CrudPokemon;
import pokemonTerminalDatos.PokeObjetos;


public class Equipo {
	
	private String nombreEquipo;
	private int posicion = 0;
	private CrudPokemon pokemons []= new CrudPokemon[6];
	private CrudObjetos objetos[];
	private int dinero = 3000;
	
	
	public Equipo(String nombre) {
		nombreEquipo = nombre;
	}
	
	public Equipo(CrudPokemon[] pokemon) {
		PokeObjetos obj = new PokeObjetos();

		this.pokemons = pokemon;

		objetos[0]=new CrudObjetos(obj.getObjetos(1));
		objetos[1]=new CrudObjetos(obj.getObjetos(2));
		objetos[2]=new CrudObjetos(obj.getObjetos(3));
		objetos[3]=new CrudObjetos(obj.getObjetos(4));
		objetos[4]=new CrudObjetos(obj.getObjetos(5));
		objetos[5]=new CrudObjetos(obj.getObjetos(6));
		objetos[6]=new CrudObjetos(obj.getObjetos(7));
		objetos[7]=new CrudObjetos(obj.getObjetos(8));
		objetos[8]=new CrudObjetos(obj.getObjetos(9));
		objetos[9]=new CrudObjetos(obj.getObjetos(10));
		objetos[10]=new CrudObjetos(obj.getObjetos(11));	
	}
	
	public Equipo(CrudPokemon p1, CrudPokemon p2, CrudPokemon p3, CrudPokemon p4, CrudPokemon p5, CrudPokemon p6) {
		PokeObjetos obj = new PokeObjetos();
		
		pokemons[0] = p1;
		pokemons[1] = p2;
		pokemons[2] = p3;
		pokemons[3] = p4;
		pokemons[4] = p5;
		pokemons[5] = p6;
		
		objetos[0]=new CrudObjetos(obj.getObjetos(1));
		objetos[1]=new CrudObjetos(obj.getObjetos(2));
		objetos[2]=new CrudObjetos(obj.getObjetos(3));
		objetos[3]=new CrudObjetos(obj.getObjetos(4));
		objetos[4]=new CrudObjetos(obj.getObjetos(5));
		objetos[5]=new CrudObjetos(obj.getObjetos(6));
		objetos[6]=new CrudObjetos(obj.getObjetos(7));
		objetos[7]=new CrudObjetos(obj.getObjetos(8));
		objetos[8]=new CrudObjetos(obj.getObjetos(9));
		objetos[9]=new CrudObjetos(obj.getObjetos(10));
		objetos[10]=new CrudObjetos(obj.getObjetos(11));
	}

	public CrudPokemon[] getPokemons() {
		return pokemons;
	}
	
	public CrudPokemon getPokemon(int i) {
		return pokemons[i];
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
	
	public String getNombreEquipo() {
		return this.nombreEquipo;
	}
	
	public void setNombreEquipo(String nombre) {
		nombreEquipo = nombre;
	}
	
	public int getDinero() {
		return dinero;
	}
	
	public void setDinero(int i) {
		dinero = i;
	}
	
	public CrudObjetos[] getObjetos() {
		return objetos;
	}
	
	public CrudObjetos getObjeto(int i) {
		return objetos[i];
	}
	
}
