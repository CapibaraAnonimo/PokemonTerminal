package pokemonTerminalCrud;

import pokemonTerminalModel.Equipo;

public class CrudEquipo {
	
	//Primero comencemos en inyectar la clase que contiene Equipo
	
	private Equipo CrudEquipo;

	private Equipo crudEquipo;
	
	public CrudEquipo (Equipo crudEquipo) {
		this.crudEquipo = crudEquipo;
	}
	
<<<<<<< HEAD
	//Continuo para relaizar el m�todo de la actualizaci�n del equipo
=======
	//Continuo para relaizar el método de la actualización del equipo
>>>>>>> 05822c3d0c1f199ffd507406bee9b3b700796830
	
	public void actualizarPosicion (int actualizarPosicion) {
		crudEquipo.setPosicion(crudEquipo.getPosicion() + actualizarPosicion);
	}
	
<<<<<<< HEAD
	public void actualizarPokemon (Equipo actualizarPokemon){
=======
	public void actualizarPokemon (Equipo actualizarPokemon) {	//Que se supone que estás haciendo aquí??
>>>>>>> 05822c3d0c1f199ffd507406bee9b3b700796830
		crudEquipo.setPokemon(crudEquipo.getPokemon());
	}
	
	//Termino devolviendo el objeto a esta clase
	
	public Equipo getEquipo () {
		return crudEquipo;
	}

}
