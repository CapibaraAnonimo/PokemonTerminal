package pokemonTerminalVista;

import pokemonTerminalModel.Pokemon;

public class Imprimir {
	
	private Pokemon imprimir;
	
	private Pokemon vistaPokemon;
	
	private String vida = "HP: ♥♥♥♥♥♥♥♥♥♥";
	
	
	
	private String prueba= "┌──────────────────────────────┐";
	 
	 private String prueba1="│";
	 
	 private String prueba2="│";
	 
	 private String prueba4="└──────────────────────────────┘";
	
		//Por ahora les declaro estos nombres para saber donde van cada uno en el menú
	private String ataque1 = "Látigo Cepa";
	private String ataque2 = "Hoja Afilada";
	private String ataque3 = "Placaje";
	private String ataque4 = "Rayo Solar";
<<<<<<< HEAD
	 
		public void  menuMovimiento (String menuAta) {
			 System.out.println(prueba + "\n" + prueba1 + ataque4 + "\t" + ataque2  + "\n" + prueba2 + ataque3 + "\t" + ataque3 + "\n" + prueba4);
=======

	public void menuMovimiento(Pokemon pokemon) {

		System.out.println(prueba + "\n" + prueba1 + pokemon.getMovimiento(0).getNombre() + "\t"
				+ pokemon.getMovimiento(1).getNombre() + "\n" + prueba2 + pokemon.getMovimiento(2).getNombre() + "\t"
				+ pokemon.getMovimiento(3).getNombre() + "\n" + prueba4);

	}

	public void pokemon(String pokemon) {

>>>>>>> f2baf9022a19dc13d3b742f1dc8ecdc91c319e67
	}
		
		public void pokemon (String pokemon) {
			
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
>>>>>>> f2baf9022a19dc13d3b742f1dc8ecdc91c319e67
		System.out.println(imprimir.getVida());
	}
	
		

		
		
	
}


