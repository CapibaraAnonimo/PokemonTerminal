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
	
	//Comienzo a realizar la actualización de la vida con objetos
	
	public void sumarVida () {
		
		
	}
	
	//metodos para actualizar, debido a las acciones 
	//metodo para actualizar/ acciones que hace cada objeto
	
	//se debe imponer condiciones para su funcionamiento, contenedor general para condiciones
	
	//se hace una condicion general para saber cual es el que me pide inicar su metodo
	
	public void accionObjeto () {
		//irá el de acVida poner nombre de objetoVida
		
		if(objetos.getTipo() == 2){
			oP.setVida(objetos.getAccion() + oP.getVida());
			 
			
		}else if (objetos.getTipo() == 3) {
			oP.setAtaque(objetos.getAccion() + oP.getAtaque());
			}else if (objetos.getTipo() == 4) {
				oP.setAtaqueEspecial(objetos.getAccion() + oP.getAtaqueEspecial());
				}else if (objetos.getTipo() == 5) {
					oP.setDefensa(objetos.getAccion() + oP.getDefensa());
				}
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
