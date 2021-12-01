package pokemonTerminalCrud;

import pokemonTerminalModel.Pokemon;
import pokemonTerminalModel.Movimiento;


public class CrudPokemon {
	//se crea un objeto crud el cual es CrudPokemon y esta vacío
	
	private Pokemon crudPokemon;
	private Movimiento crudMovimiento;
	
	
	public CrudPokemon(Pokemon crudPokemon) {
		this.crudPokemon = crudPokemon;
	}
	
	
	//Voy a comenzar a realizar la actualizaci�n de la defensa
	
	//M�todo 1: Importo el paquete Model para llamar a los atributos y poder actualizar la defensa
	//A ra�zdel ejemplo de �ngel, lo llamamos con los set y get del paquete model
	public void actualizarDefensa (int actDefensa) {
		crudPokemon.setDefensa(crudPokemon.getDefensa() + actDefensa);
	}

	//Continuo con la actualizaci�n de la defensa especial, que es basicamente lo mismo que el anterior a la hora de llamar los atributos
	public void actualizarDefensaEspecial (int actDefensaEspecial) {
		crudPokemon.setDefensaEspecial(crudPokemon.getDefensaEspecial() + actDefensaEspecial);
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
