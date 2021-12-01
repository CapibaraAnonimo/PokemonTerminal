package pokemonTerminalCrud;

import pokemonTerminalModel.Pokemon;
import pokemonTerminalModel.Movimiento;


public class CrudPokemon {

	//Vamos a inyectar los demas paquetes a nuestra clase para poder acceder a sus elementos
	private Pokemon crudPokemon;
	private Movimiento crudMovimiento;
	
	//Procedo a crear un constructor tanto para tipo de Pokemon como para los movimientos.
	
	public CrudPokemon () {
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	//Metodo para actualizarDefensa
	public void actualizarDefensa (int actDefensa) {
		crudPokemon.setDefensa(crudPokemon.getDefensa() + actDefensa);
	}
	//Metodo para actualizar defensaEspecial

	public void actualizarDefensaEspecial (int actDefensaEspecial) {
		crudPokemon.setDefensaEspecial(crudPokemon.getDefensaEspecial() + actDefensaEspecial);
	}

	//Metodo para actualizar vida
	public void actulizarVida (int acVida) {
		crudPokemon.setVida(crudPokemon.getVida() + acVida);
		
	}
	
	//Metodo actualizar Ataque
	public void actualizarAtaque(int acAtaque) {
		crudPokemon.setAtaque(crudPokemon.getAtaque() + acAtaque);
		
	}
	
	//Metodo actualizar ataqueespecial
	public void actualizarAtaqueEspecial (int acAtaqueEspecial) {
		crudPokemon.setAtaqueEspecial(crudPokemon.getAtaqueEspecial() + acAtaqueEspecial);
		
	}
	
	//metodo para actualizar los movimientos 
	public void actualizarMovimiento () {
		crudMovimiento.setPp(crudMovimiento.getPp() - 1);
			
	}
	
	//Metodo para que devuelva el Pokemon.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
