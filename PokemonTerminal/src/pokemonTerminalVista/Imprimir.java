package pokemonTerminalVista;

import pokemonTerminalDatos.CuadroAtaquesImprimir;
import pokemonTerminalModel.Pokemon;

public class Imprimir {

	// Por ahora les declaro estos nombres para saber donde van cada uno en el menú


	CuadroAtaquesImprimir i = new CuadroAtaquesImprimir();;
	public void menuMovimiento(Pokemon pokemon) {
		System.out.println(i.cuadroAtaqueArriba() + "\n" + i.cuadroAtaqueMedio() + "1." + pokemon.getMovimiento(0).getMovimiento().getNombre() + "\t" + "2."
				+ pokemon.getMovimiento(1).getMovimiento().getNombre() + "\n" + i.cuadroAtaqueMedio() + "3." + pokemon.getMovimiento(2).getMovimiento().getNombre() + "\t" + "4."
				+ pokemon.getMovimiento(3).getMovimiento().getNombre() + "\n" + i.cuadroAtaqueAbajo());
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// PARA IMPRIMIR LA VIDA HE USADO EL PRINTLN Y imprimiré lo que hay en getVida
	// de la clase Model ya que de la clase CRUD no me deja hacerlo.
	public void imprimirVida(Pokemon imprimir) {
		System.out.println(imprimir.getVida());
	}
	public void imprimirLogo () {
		System.out.println(i.logoInicio());
	}
	
	public void imprimirVidaDibujo (Pokemon imprimir) {
		for (int i=0;  i < imprimir.getVida() / 3; i++)
			if (imprimir.getVida() >= 60) {
				System.out.print("█");
			}else if (imprimir.getVida() <= 50) {
				for (int j= 0; j < imprimir.getVida() / imprimir.getVida(); j++) {
					System.out.print("▓");
				}
			}
	}
	
	public void imprimirSprites(Pokemon p1, Pokemon p2) {
		for(int i = 0; ((i < p1.getSprite().length) && (i < p2.getSprite().length)); i++)
		{
			if(i < p1.getSprite().length)
			{
				StringBuilder input = new StringBuilder();
				input.append(p1.getSprite()[i]);
				input.reverse();
				System.out.printf(input + "\t\t\t\t");
			}else {
				System.out.printf(p1.getSprite()[0] + "\t\t\t\t");
			}
			
			if(i < p2.getSprite().length)
			{
				System.out.printf(p2.getSprite()[i] + "\n");
			}else {
				System.out.println();
			}
			
			if(i >= p2.getSprite().length && i >= p1.getSprite().length)
				i = 1000;
		}
	}

}
