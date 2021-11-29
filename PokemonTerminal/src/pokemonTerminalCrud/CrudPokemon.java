package pokemonTerminalCrud;

import pokemonTerminalModel.Pokemon;


public class CrudPokemon {
	//se crea un objeto crud el cual es CrudPokemon y esta vacío
	
	private Pokemon crudPokemon;
	
	//Voy a comenzar a realizar la actualizaci�n de la defensa
	
	//M�todo 1: Importo el paquete Model para llamar a los atributos y poder actualizar la defensa
	public void actualizarDefensa (int defensa) {
		//get.defensa + defensa;
		
		
	}
	
	//
	public void actualizarDefensaEspecial (int defensaEspecial) {
		//get.defensaEspecial + defensaEspecial;
	}
	/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//Maylor procedo a crear métodos para :
	//Actualizar la vida Método 1
	//el acVida es actualizar vida, uso un public void para que se pueda acceder a este
	public void actulizarVida (int acVida) {
		crudPokemon.setVida(crudPokemon.getVida() + acVida);
		
	}
	
	//Metodo numero 3 actualizar daño
	public void actualizarAtaque(int acAtaque) {
		crudPokemon.setAtaque(crudPokemon.getAtaque() + acAtaque);
		
	}
	
	//Metodo actualizar ataqueespecial
	public void actualizarAtaqueEspecial (int acAtaqueEspecial) {
		crudPokemon.setAtaqueEspecial(crudPokemon.getAtaqueEspecial() + acAtaqueEspecial);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
