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
				oP.getDefensa(), oP.getDefensaEspecial(), oP.getAtaqueEspecial(), oP.getVelocidad());
	}
	
	//metodos para actualizar, debido a las acciones 
	//metodo para actualizar/ acciones que hace cada objeto
	
	//se debe imponer condiciones para su funcionamiento
	
	public void accionAtaqueEspecial() {
		oP.setAtaqueEspecial(objetos.getAccion() + oP.getAtaqueEspecial());
		
	}

	public void accionDefensa() {
		oP.setDefensa(objetos.getAccion() + oP.getDefensa());
		
	}
	
	public void accionDefensaEs() {
		oP.setDefensaEspecial(objetos.getAccion() + oP.getDefensaEspecial());
	}
	
	public void accionVelocidad () {
		oP.setVelocidad(objetos.getAccion() + oP.getVelocidad());
	}
	
	public void accionPresicion () {
		oP.setPrecision(objetos.getAccion() + oP.getPrecision());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
