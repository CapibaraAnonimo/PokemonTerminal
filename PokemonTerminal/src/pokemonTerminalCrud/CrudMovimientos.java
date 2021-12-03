package pokemonTerminalCrud;

import pokemonTerminalModel.Movimiento;

public class CrudMovimientos {
	
	//se inyecta la clase crud moviemiento
	private Movimiento crudMovimiento;

	//se crea un constructor para igualar.
	public CrudMovimientos(Movimiento crudMovimiento) {
		this.crudMovimiento = crudMovimiento;
	}
	
	//metodo para actualizar los movimientos (el Pp)
	public void actualizarMovimiento () {
		crudMovimiento.setPp(crudMovimiento.getPp() - 1);
	}
	
	//devuelve el objeto de esta clase 
	
	public Movimiento getMovimiento () {
		return crudMovimiento;
	}

	
	
	
	
	
}
