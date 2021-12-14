package pokemonTerminalVista;

import pokemonTerminalModel.Pokemon;

public class Imprimir {

	private Pokemon imprimir;

	private Pokemon vistaPokemon;

	private String vida;

	private String prueba =  "┌──────────────────────────────┐";

	private String prueba1 = "│";

	private String prueba2 = "│";

	private String prueba4 = "└──────────────────────────────┘";

	// Por ahora les declaro estos nombres para saber donde van cada uno en el menú
	private String ataque1 = "Látigo Cepa";
	private String ataque2 = "Hoja Afilada";
	private String ataque3 = "Placaje";
	private String ataque4 = "Rayo Solar";

	public void menuMovimiento(Pokemon pokemon) {

		System.out.println(prueba + "\n" + prueba1 + pokemon.getMovimiento(0).getNombre() + "\t"
				+ pokemon.getMovimiento(1).getNombre() + "\n" + prueba2 + pokemon.getMovimiento(2).getNombre() + "\t"
				+ pokemon.getMovimiento(3).getNombre() + "\n" + prueba4);

	}

	public void pokemon(String pokemon) {

	}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// PARA IMPRIMIR LA VIDA HE USADO EL PRINTLN Y imprimiré lo que hay en getVida
	// de la clase Model ya que de la clase CRUD no me deja hacerlo.
	public void imprimirVida(Pokemon imprimir) {
		System.out.println(imprimir.getVida());
	}
	public void imprimirVidaDibujo (Pokemon imprimir) {
		for (int i=0;  i < imprimir.getVida() / 3; i++)
			if (imprimir.getVida() > 60) {
				System.out.print("█");
			}else if (imprimir.getVida() <= 50) {
				for (int j= 0; j < imprimir.getVida() / imprimir.getVida(); j++) {
					System.out.print("░");
				}
			}	
	}	

}
