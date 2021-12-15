package pokemonTerminalVista;

import pokemonTerminalModel.Pokemon;

public class Imprimir {

	private String prueba =  "┌──────────────────────────────┐";

	private String prueba1 = "│";

	private String prueba2 = "│";

	private String prueba4 = "└──────────────────────────────┘";

	// Por ahora les declaro estos nombres para saber donde van cada uno en el menú

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
					System.out.print("▓");
				}
			}
	}
	
	public void imprimirSprites(Pokemon p1, Pokemon p2) {
		for(int i = 0; i < p1.getSprite().length; i++)
		{
			StringBuilder input = new StringBuilder();
			input.append(p1.getSprite()[i]);
			input.reverse();
			System.out.printf(input + "\t\t\t\t");
			System.out.printf(p2.getSprite()[i] + "\n");
		}
	}

}
