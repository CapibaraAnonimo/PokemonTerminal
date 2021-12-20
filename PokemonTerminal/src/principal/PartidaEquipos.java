package principal;

import pokemonTerminalCrud.CrudEquipo;
import pokemonTerminalCrud.CrudPokemon;
import pokemonTerminalCrud.CrudTienda;
import pokemonTerminalDatos.PokeAtaques;
import pokemonTerminalDatos.PokeStats;
import pokemonTerminalVista.Imprimir;
import utilidades.Leer;

public class PartidaEquipos {

	public static void main(String[] args) 
	{
		PokeStats lp = new PokeStats();
		PokeAtaques ata = new PokeAtaques();
		Imprimir imprimir = new Imprimir();
		CrudEquipo equipos[] = new CrudEquipo[2];
		CrudTienda tienda = new CrudTienda();
		int aux1 = 0;
		int aux2 = 0;
		
		
		
		System.out.println("Jugador 1, diga su nombre o nombre de equipo");
		equipos[0] = new CrudEquipo(Leer.dato());
		
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < lp.stats.length; j++) 
			{
				System.out.println(lp.stats[j]);
			}
			System.out.printf("Seleccione el pokemon %d\n", (i+1));
			equipos[0].actualizarPokemon(new CrudPokemon(lp.getPokemon(Leer.datoInt())), i);
		}
		System.out.println("Tu equipo es: \n");
		for(int i = 0; i < equipos[0].getEquipo().getPokemons().length; i++)
		{
			System.out.println(equipos[0].getEquipo().getPokemon(i+1).getPokemon());
		}
		
		System.out.println("Quiere cambiar un pokemon");
		
		
		System.out.println("Tienda\n\n");
		
		do
		{
			System.out.println("1. Comprar objetos\n"
					+ "2. Mirar Carrito"
					+ "3. Pagar"
					+ "4. Salir");
			aux1 = Leer.datoInt();
			switch(aux1)
			{
			case 1:
				System.out.println("Diga el objeto que quiere (0 para salir)");
				for(int i = 0; i < tienda.getTienda().getObjetos().length; i++)
				{
					System.out.printf("Objeto %d:\n", (i+1));
					System.out.println(tienda.getTienda().getObjeto(i).getObjeto() + "\n");
				}
				aux1 = Leer.datoInt();
				if(aux1 != 0)
				{
					System.out.println("Diga cuantas unidades quiere");
					aux2 = Leer.datoInt();
					tienda.actualizarCantidad(tienda.getTienda().getObjeto(aux1).getObjeto(), aux2);
				}
				break;
			case 2:
				for(int i = 0; i < tienda.getTienda().getObjetos().length; i++)
				{
					if(tienda.getTienda().getObjeto(i).getObjeto().getCantidad() > 0)
					{
						System.out.println(tienda.getTienda().getObjeto(i).getObjeto() 
								+ "x" + tienda.getTienda().getObjeto(i).getObjeto().getCantidad());
					}
				}
				break;
			case 3:
				System.out.println("Su compra es:");
				for(int i = 0; i < tienda.getTienda().getObjetos().length; i++)
				{
					if(tienda.getTienda().getObjeto(i).getObjeto().getCantidad() > 0)
					{
						System.out.println(tienda.getTienda().getObjeto(i).getObjeto() 
								+ " x " + tienda.getTienda().getObjeto(i).getObjeto().getCantidad());
					}
				}
				System.out.print("Precio total: ");
				for(int i = 0; i < tienda.getTienda().getObjetos().length; i++)
				{
					if(tienda.getTienda().getObjeto(i).getObjeto().getCantidad() > 0)
					{
						aux2 = aux2+(tienda.getTienda().getObjeto(i).getObjeto().getCantidad()*tienda.getTienda().getObjeto(i).getObjeto().getPrecio());
					}
				}
				System.out.println(aux2);
				System.out.println("1. Pagar"
						+ "2. Volver al menú");
				if(aux2 <= equipos[0].getEquipo().getDinero())
				{
					equipos[0].actualizarDinero((-aux2));
					for(int i = 0; i < tienda.getTienda().getObjetos().length; i++)
					{
						if(tienda.getTienda().getObjeto(i).getObjeto().getCantidad() > 0)
						{
							equipos[0].getEquipo().getObjeto(i).actualizarCantidad(tienda.getTienda().getObjeto(i).getObjeto().getCantidad());
						}
					}
				}else {
					System.out.println("No tiene suficiente dinero para efectuar la compra");
				}
				break;
			default:
				break;
			}
		}while(aux1 != 3);
		
	}

}
