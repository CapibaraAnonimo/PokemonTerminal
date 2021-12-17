package pokemonTerminalCrud;

import pokemonTerminalModel.Equipo;

public class CrudEquipo {
	Equipo equipo;
	
	public CrudEquipo(String nombre) {
		equipo = new Equipo(nombre);
	}
	
	public CrudEquipo(CrudPokemon p1, CrudPokemon p2, CrudPokemon p3, CrudPokemon p4, CrudPokemon p5, CrudPokemon p6) {
		equipo = new Equipo(p1, p2, p3, p4, p5, p6);
	}
	
	public CrudEquipo(Equipo e) {
		equipo = new Equipo(e.getPokemon(1), e.getPokemon(2), e.getPokemon(3), e.getPokemon(4), e.getPokemon(5), e.getPokemon(6));
	}
	
	public Equipo getEquipo() {
		return equipo;
	}
	
	public void actualizarPokemon(CrudPokemon pokemon, int i) {
		equipo.setPokemon(pokemon, i);
	}
	
}
