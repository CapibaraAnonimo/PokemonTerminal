package pokemonTerminalDatos;

import pokemonTerminalModel.Pokemon;

public class PokeStats {
	//pokede id, hp, ataque, defensa, ataque especial, defensa especial, velocidad
	public Pokemon stats[] = {
			new Pokemon(1, "Bulbasur", 11, 120, 75, 76, 69, 85, 65),
			new Pokemon(2, "Charmander", 4, 114, 79, 63, 72, 70, 85),
			new Pokemon(3, "Squirtle", 7, 119, 74, 85, 63, 84, 63),
			new Pokemon(4, "Pikachu", 11, 120, 75, 76, 69, 85, 65),
			new Pokemon(5, "Metapod", 11, 120, 75, 76, 69, 85, 65),
			new Pokemon(6, "Vulpix", 11, 120, 75, 76, 69, 85, 65)
	}; 

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
