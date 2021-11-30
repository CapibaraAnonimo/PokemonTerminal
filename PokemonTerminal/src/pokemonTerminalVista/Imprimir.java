package pokemonTerminalVista;

import pokemonTerminalModel.Pokemon;

public class Imprimir {
	private Pokemon imprimir;
	
	private Pokemon vistaPokemon;
	
	 static String menuAtaqueArriba = "________________________________";
	  

	 static String menuAtaqueAbajo =  "________________________________ ";
	
		//Por ahora les declaro estos nombres para saber donde van cada uno en el menú
	 static String ataque1 = "Látigo Cepa";
	 static String ataque2 = "Hoja Afilada";
	 static String ataque3 = "Placaje";
	 static String ataque4 = "Rayo Solar";
	 
		public static void menuMovimiento () {
			System.out.println(menuAtaqueArriba + "\n*" + ataque1 + "\t*" + ataque2 + "\n*" + ataque3 + "\t*"+ ataque4 + "\n" + menuAtaqueAbajo);
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//PARA IMPRIMIR LA VIDA HE USADO EL PRINTLN Y imprimiré lo que hay en getVida de la clase Model ya que de la clase CRUD no me deja hacerlo.
		public void ImprimirVida() {
		System.out.println(imprimir.getVida());
	}
	
		

		
		
	
}


