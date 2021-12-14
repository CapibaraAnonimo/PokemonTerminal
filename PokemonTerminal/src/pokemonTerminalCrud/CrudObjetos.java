package pokemonTerminalCrud;

import pokemonTerminalModel.Pokemon;
import pokemonTerminalModel.Objetos;

public class CrudObjetos {

	
	private Objetos objetos;
	private Pokemon oP;
	
	//constructor objeto
	public CrudObjetos (Objetos o) {
		objetos = new Objetos (o.getPrecio(), o.getTipo(), o.getAccion());		
	}
	
	//constructor para objeto pokemon
	public CrudObjetos(Pokemon oP) {
		oP = new Pokemon(oP.getId(), oP.getNombre(),oP.getTipo(), oP.getVida(), oP.getAtaque(),
				oP.getDefensa(), oP.getDefensaEspecial(), oP.getAtaqueEspecial(), oP.getVelocidad(), oP.getSprite());
	}
	
	
	//metodos para actualizar, debido a las acciones 	
	//se debe imponer condiciones para su funcionamiento, contenedor general para condiciones
		
	public void accionObjeto () {
		if(objetos.getTipo() == 1) {
			oP.setVida(objetos.getTipo() + oP.getVida());			
		}else if(objetos.getTipo() == 2){
			oP.setVida(objetos.getAccion() + oP.getVida());
			}else if (objetos.getTipo() == 3) {
				oP.setAtaque(objetos.getAccion() + oP.getAtaque());
				}else if (objetos.getTipo() == 4) {
					oP.setAtaqueEspecial(objetos.getAccion() + oP.getAtaqueEspecial());
					}else if (objetos.getTipo() == 5) {
						oP.setDefensa(objetos.getAccion() + oP.getDefensa());
						}else if (objetos.getTipo() == 6) {
							oP.setDefensa(objetos.getTipo() + oP.getDefensa());
							}else if (objetos.getTipo() == 7) {
								oP.setVelocidad(objetos.getTipo() + oP.getVelocidad());
								}else if (objetos.getTipo() == 8) {
									oP.setPrecision(objetos.getTipo() + oP.getPrecision());
								}
	}	
}
