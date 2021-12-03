package pokemonTerminalDatos;

import pokemonTerminalModel.Pokemon;

public class PokeStats {
	//pokede id, hp, ataque, defensa, ataque especial, defensa especial, velocidad
	public Pokemon stats[] = {new Pokemon(1, "Bulbasur", 11, 120, 75, 76, 69, 85, 65)}; //Bulbasur
							//{4, 114, 79, 63, 72, 70, 85}, //Charmander
							//{7, 119, 74, 85, 63, 84, 63}}; //Squirtle

	public Pokemon getPokemon(int id)
	{
		for(int i = 0; i < stats.length; i++)
		{
			if(stats[i].getId() == id)
			{
				return stats[i];
			}
		}
		return null;
	}
}
