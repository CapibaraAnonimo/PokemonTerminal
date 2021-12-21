package pokemonTerminalCrud;

import pokemonTerminalModel.Movimiento;
import pokemonTerminalModel.Objetos;
import pokemonTerminalModel.Pokemon;

public class CrudObjetos {

	
	private Objetos objetos;

	//constructor objeto
	public CrudObjetos (Objetos o) {
		objetos = new Objetos (o.getId(), o.getNombre(), o.getPrecio(), o.getTipo(), o.getAccion(), o.getCantidad());		
	}
	
	public Objetos getObjeto() {
		return objetos;
	}
	
	public void actualizarCantidad(int cant) {
		objetos.setCantidad(objetos.getCantidad()+cant);
	}
	
	//metodos para actualizar, debido a las acciones 	
	//se debe imponer condiciones para su funcionamiento, contenedor general para condiciones
		
	public void accionObjeto (Pokemon p) {
		if(objetos.getTipo() == 1 && p.getVida() > 0) {
			p.setVida(objetos.getAccion() + p.getVida());
		}else if(objetos.getTipo() == 2){
			p.setVida(objetos.getAccion() + p.getVida());
			}else if (objetos.getTipo() == 3) {
				p.setAtaque(objetos.getAccion() + p.getAtaque());
				}else if (objetos.getTipo() == 4) {
					p.setAtaqueEspecial(objetos.getAccion() + p.getAtaqueEspecial());
					}else if (objetos.getTipo() == 5) {
						p.setDefensa(objetos.getAccion() + p.getDefensa());
						}else if (objetos.getTipo() == 6) {
							p.setDefensa(objetos.getTipo() + p.getDefensa());
							}else if (objetos.getTipo() == 7) {
								p.setVelocidad(objetos.getTipo() + p.getVelocidad());
								}else if (objetos.getTipo() == 8) {
								p.setPrecision(objetos.getTipo() + p.getPrecision());
								}
	}	
}
