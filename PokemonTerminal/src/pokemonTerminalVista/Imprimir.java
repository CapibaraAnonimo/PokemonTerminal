package pokemonTerminalVista;

import pokemonTerminalModel.Pokemon;

public class Imprimir {
	private Pokemon imprimir;
	
	
	
	 String menuAtaqueArriba = "__________________________";
	  

	 String menuAtaqueAbajo =  "__________________________";
	
		//Por ahora les declaro estos nombres para saber donde van cada uno en el menú
	 String ataque1 = "Ataque1";
	 String ataque2 = "Ataque2";
	 String ataque3 = "Ataque3";
	 String ataque4 = "Ataque4";
	 
		public static void menuMovimiento () {
			System.out.println(menuAtaqueArriba + "\n*" + ataque1 + "\t*" + ataque2 + "\n*" + ataque3 + "\t*"+ ataque4 + "\n" + menuAtaqueAbajo);
			
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//PARA IMPRIMIR LA VIDA HE USADO EL PRINTLN Y imprimiré lo que hay en getVida de la clase Model ya que de la clase CRUD no me deja hacerlo.
		public void ImprimirVida() {
		System.out.println(imprimir.getVida());
	}
	
		

		
		
	
}


