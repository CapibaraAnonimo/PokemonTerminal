package pokemonTerminalCrud;

import pokemonTerminalModel.Movimiento;

public class CrudMovimientos {

	private Movimiento crudMovimiento;

	public CrudMovimientos(Movimiento crudMovimiento) {
		this.crudMovimiento = crudMovimiento;
	}
	 
	//metodo para actualizar los movimientos 
	public void actualizarMovimiento () {
		crudMovimiento.setPp(crudMovimiento.getPp() - 1);
<<<<<<< HEAD
=======

>>>>>>> 2af583addb74db319944fc66338e143a1e1ba4b7
	}
	
	//devuelve el objeto de esta clase 
	
	public Movimiento getMovimiento () {
		return crudMovimiento;
<<<<<<< HEAD

=======
>>>>>>> 2af583addb74db319944fc66338e143a1e1ba4b7
	}

	
}
