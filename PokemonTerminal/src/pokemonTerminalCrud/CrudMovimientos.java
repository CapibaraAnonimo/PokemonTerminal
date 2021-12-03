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
	}
	
	//devuelve el objeto de esta clase 
	
	public Movimiento getMovimiento () {
		return crudMovimiento;
>>>>>>> f482b46444dbfb1c986500993c912f65fe48d8b6
	}

	
}
