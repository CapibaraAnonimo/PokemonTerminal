package pokemonTerminalDatos;

import pokemonTerminalModel.Objetos;

public class PokeObjetos {

	
	public Objetos obj[]= {
			
							//id, nombre, precio, tipo, accion
							new Objetos(1, "Poción", 300, 1, 20),
							new Objetos(2, "SuperPoción", 700, 1, 50),
							new Objetos(3, "HiperPoción",1200, 1, 200),
							new Objetos(4, "Revivir", 1500, 2, 50),
							new Objetos(5, "Revivir Max", 2000, 2, 100),
							new Objetos(6, "Ataque X", 500, 3, 20),
							new Objetos(7, "Especial X", 350, 4, 20),
							new Objetos(8, "Defensa X", 550, 5, 20),
							new Objetos(9, "Defensa Esp X", 350, 6, 20),
							new Objetos(10, "Velocidad X", 350, 7, 20),
							new Objetos(11, "Precision X", 950, 8, 20),
	};
	
	public Objetos getObjetos(int id){
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getId() == id)
			{
				return obj[i];
			}
		}
		return null;
	}
	
}
