package pokemonTerminalCrud;

import pokemonTerminalModel.Movimiento;

public class CrudMovimientos {

	private Movimiento movimiento;

	public CrudMovimientos(Movimiento crudMovimiento) {
		this.movimiento = crudMovimiento;
	}
	 
	//metodo para actualizar los movimientos 
	public void actualizarMovimiento () {
		movimiento.setPp(movimiento.getPp() - 1);
	}
	
	//devuelve el objeto de esta clase 
	
	public Movimiento getMovimiento () {
		return movimiento;

	}

	
}
