package pokemonTerminalVista;

import pokemonTerminalModel.Pokemon;

public class Imprimir {
	private Pokemon imprimir;

	private Pokemon vistaPokemon;
<<<<<<< HEAD
	private String vida = "HP: ♥♥♥♥♥♥♥♥♥♥";
	
	
	private String prueba= "┌──────────────────────────────┐";
	 
	 private String prueba1="│";
	 
	 private String prueba2="│";
	 
	 private String prueba4="└──────────────────────────────┘";
	
		//Por ahora les declaro estos nombres para saber donde van cada uno en el menú
=======

	private String prueba = "┌──────────────────────────────┐";

	private String prueba1 = "│";

	private String prueba2 = "│";

	private String prueba4 = "└──────────────────────────────┘";

	// Por ahora les declaro estos nombres para saber donde van cada uno en el menú
>>>>>>> 49759438c6e160cda4a6962e31d9a9075ea42695
	private String ataque1 = "Látigo Cepa";
	private String ataque2 = "Hoja Afilada";
	private String ataque3 = "Placaje";
	private String ataque4 = "Rayo Solar";

	public void menuMovimiento(Pokemon pokemon) {
		System.out.println(prueba + "\n" + prueba1 + ataque4 + "\t" + ataque2 + "\n" + prueba2 + ataque3 + "\t"
				+ ataque1 + "\n" + prueba4);
	}

	public void pokemon(String pokemon) {

	}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<<<<<<< HEAD
	//PARA IMPRIMIR LA VIDA HE USADO EL PRINTLN Y imprimiré lo que hay en getVida de la clase Model ya que de la clase CRUD no me deja hacerlo.
		public void ImprimirVida() {
			System.out.println(vida);
=======
	// PARA IMPRIMIR LA VIDA HE USADO EL PRINTLN Y imprimiré lo que hay en getVida
	// de la clase Model ya que de la clase CRUD no me deja hacerlo.
	public void imprimirVida(Pokemon imprimir) {
>>>>>>> 49759438c6e160cda4a6962e31d9a9075ea42695
		System.out.println(imprimir.getVida());
	}
	

}
