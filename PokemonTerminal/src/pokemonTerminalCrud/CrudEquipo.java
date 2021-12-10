package pokemonTerminalCrud;

import pokemonTerminalModel.Equipo;
import pokemonTerminalModel.Pokemon;

public class CrudEquipo {
	
	//Primero comencemos en inyectar la clase que contiene Equipo

	private Equipo equipo;
	
	public CrudEquipo (Equipo e) {
		equipo = new Equipo e.setPokemon(null), e.setPokemon(null), e.getPosicion(), ;

	}



	//Continuo para relaizar el método de la actualización del equipo

	
	public void actualizarPosicion (int actualizarPosicion) {
		equipo.setPosicion(equipo.getPosicion() + actualizarPosicion);
	}
	

	public void actualizarPokemon (Equipo actualizarPokemon){
	equipo.setPokemon(equipo.getPokemon());
	}
	
	//Termino devolviendo el objeto a esta clase
	
	public Equipo getEquipo () {
		return equipo;
	}

}
