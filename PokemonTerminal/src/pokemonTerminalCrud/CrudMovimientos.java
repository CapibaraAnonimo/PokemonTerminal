package pokemonTerminalCrud;

import pokemonTerminalModel.Movimiento;

public class CrudMovimientos {

	private Movimiento movimiento;

	public CrudMovimientos(Movimiento m) {
		movimiento = new Movimiento (m.getId(), m.getNombre(), m.getTipo(), m.getPoder(), m.getPrecision(), m.getPp(),
				m.getCategoria(), m.getCondicionEstado(), m.getProbEstado());
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
