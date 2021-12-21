package pokemonTerminalController;

import pokemonTerminalCrud.CrudEquipo;
import pokemonTerminalCrud.CrudTienda;
import utilidades.Leer;

public class ControllerTienda {
	
	
	public static void tienda(CrudEquipo equipo) {
		CrudTienda tienda = new CrudTienda();
		int aux1 = 0;
		int aux2 = 0;
		
		System.out.println("Tienda\n\n");
		
		do
		{
			System.out.println("\n\n1. Comprar objetos\n"
					+ "2. Mirar Carrito\n"
					+ "3. Pagar\n"
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
					tienda.actualizarCantidad(tienda.getTienda().getObjeto(aux1-1).getObjeto(), aux2);
				}
				break;
			case 2:
				for(int i = 0; i < tienda.getTienda().getObjetos().length; i++)
				{
					if(tienda.getTienda().getObjeto(i).getObjeto().getCantidad() > 0)
					{
						System.out.println("\n" + tienda.getTienda().getObjeto(i).getObjeto() 
								+ "x" + tienda.getTienda().getObjeto(i).getObjeto().getCantidad());
					}
				}
				break;
			case 3:
				System.out.println("\n\nSu compra es:");
				for(int i = 0; i < tienda.getTienda().getObjetos().length; i++)
				{
					if(tienda.getTienda().getObjeto(i).getObjeto().getCantidad() > 0)
					{
						System.out.println(tienda.getTienda().getObjeto(i).getObjeto() 
								+ " x " + tienda.getTienda().getObjeto(i).getObjeto().getCantidad());
					}
				}
				System.out.print("Precio total: ");
				aux2 = 0;
				for(int i = 0; i < tienda.getTienda().getObjetos().length; i++)
				{
					if(tienda.getTienda().getObjeto(i).getObjeto().getCantidad() > 0)
					{
						aux2 = aux2+(tienda.getTienda().getObjeto(i).getObjeto().getCantidad()*tienda.getTienda().getObjeto(i).getObjeto().getPrecio());
					}
				}
				System.out.println(aux2);
				System.out.println("1. Pagar\n"
						+ "2. Volver al menú");
				if(aux2 <= equipo.getEquipo().getDinero())
				{
					equipo.actualizarDinero((-aux2));
					for(int i = 0; i < tienda.getTienda().getObjetos().length; i++)
					{
						if(tienda.getTienda().getObjeto(i).getObjeto().getCantidad() > 0)
						{
							equipo.getEquipo().getObjeto(i).actualizarCantidad(tienda.getTienda().getObjeto(i).getObjeto().getCantidad());
						}
					}
				}else {
					System.out.println("No tiene suficiente dinero para efectuar la compra");
				}
				break;
			default:
				break;
			}
		}while(aux1 != 4);
		
	}
	
}
