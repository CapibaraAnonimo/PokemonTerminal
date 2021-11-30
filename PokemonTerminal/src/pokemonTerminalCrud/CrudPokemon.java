package pokemonTerminalCrud;

import pokemonTerminalModel.Pokemon;


public class CrudPokemon {
	//se crea un objeto crud el cual es CrudPokemon y esta vacÃ­o
	
	private Pokemon crudPokemon;
	
	//Voy a comenzar a realizar la actualizaciï¿½n de la defensa
	
	//Mï¿½todo 1: Importo el paquete Model para llamar a los atributos y poder actualizar la defensa
	//A raízdel ejemplo de Ángel, lo llamamos con los set y get del paquete model
	public void actualizarDefensa (int actDefensa) {
		crudPokemon.setDefensa(crudPokemon.getDefensa() + actDefensa);
	}

	//Continuo con la actualización de la defensa especial, que es basicamente lo mismo que el anterior a la hora de llamar los atributos
	public void actualizarDefensaEspecial (int actDefensaEspecial) {
		crudPokemon.setDefensaEspecial(crudPokemon.getDefensaEspecial() + actDefensaEspecial);
	}
	/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//Maylor procedo a crear mÃ©todos para :
	//Actualizar la vida MÃ©todo 1
	//el acVida es actualizar vida, uso un public void para que se pueda acceder a este
	public void actulizarVida (int acVida) {
		crudPokemon.setVida(crudPokemon.getVida() + acVida);
		
	}
	
	//Metodo numero 3 actualizar daÃ±o
	public void actualizarAtaque(int acAtaque) {
		crudPokemon.setAtaque(crudPokemon.getAtaque() + acAtaque);
		
	}
	
	//Metodo actualizar ataqueespecial
	public void actualizarAtaqueEspecial (int acAtaqueEspecial) {
		crudPokemon.setAtaqueEspecial(crudPokemon.getAtaqueEspecial() + acAtaqueEspecial);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
