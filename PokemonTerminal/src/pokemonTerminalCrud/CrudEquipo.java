package pokemonTerminalCrud;

import pokemonTerminalModel.Equipo;

public class CrudEquipo {
	
	//Primero comencemos en inyectar la clase que contiene Equipo
	
	private Equipo CrudEquipo;

	private Equipo crudEquipo;
	
	public CrudEquipo (Equipo crudEquipo) {
		this.crudEquipo = crudEquipo;
	}
	
	//Continuo para relaizar el método de la actualización del equipo
	
	public void actualizarPosicion (int actualizarPosicion) {
		crudEquipo.setPosicion(crudEquipo.getPosicion() + actualizarPosicion);
	}
	
	public void actualizarPokemon (Equipo actualizarPokemon) {	//Que se supone que estás haciendo aquí??
		crudEquipo.setPokemon(crudEquipo.getPokemon());
	}
	
	//Termino devolviendo el objeto a esta clase
	
	public Equipo getEquipo () {
		return crudEquipo;
	}

}
