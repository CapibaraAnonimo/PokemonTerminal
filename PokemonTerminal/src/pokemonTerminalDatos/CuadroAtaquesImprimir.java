package pokemonTerminalDatos;

import pokemonTerminalModel.Pokemon;

public class CuadroAtaquesImprimir {
	
	
	private String cuadroArriba =  "┌──────────────────────────────┐";

	private String cuadroMedio = "│";

	private String cuadroAbajo = "└──────────────────────────────┘";

	public String cuadroAtaqueArriba () {
		String im;
		im ="┌──────────────────────────────┐";
		
		return im;
	}
	
<<<<<<< HEAD
	public String cuadroAtaqueMedio () {
		String cuadroMedio;
		cuadroMedio = "│";
		
		return cuadroMedio;
	}
=======
	private String logo = new String(
			  "                                                                                                            ▄▄▓▓\r\n"
			+ "                                                                                                          ▄█▓▓▓▓▓▄\r\n"
			+ "                                                                                                        ▄█▓▓▓▓▓▓▓▓▓\r\n"
			+ "                                                                                                      ▄█▓▓▓▓▓▒▓▓▓▓▓▓▄\r\n"
			+ "                                                                                                    ▄▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓\r\n"
			+ "                                                                             ▄▄  ▄▄▄               ▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▀\r\n"
			+ "                                                                      ▄▄▄▓▓▓▓▓▓██▓▓▓▓▄           ▓▓▓▓▓▓▒▒▒▓▓▓▓▓▓▀▀                    ▄▄▓▓▓▓▓▓▓▓▓▓▓▓▌\r\n"
			+ "                  ▄▄▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄▄▄                      ▄▄▄▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▄      ▓██▓▓▓▓▓▓▓▓▓▓▓▀          ▄▄█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓              ▄\r\n"
			+ "            ▄▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄              ▄▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄    ▀███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄▄   ▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓           ▄███▓▓▓▓▓▓▓▄▄▄\r\n"
			+ "        ▄▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓           ▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▄ ▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄█▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▌          ▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄\r\n"
			+ "    ▄▄▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▄         █▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓          ▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▄▄▄\r\n"
			+ " ▄█▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓          ▐▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄\r\n"
			+ "▐████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▌       ▐▓▓▓▓██▓▓▓▓▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▌        ▄▐▓▓▓██▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n"
			+ " ▀▓▓▓█▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓           ███▓▓▓▓▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▀  ▐▓▓▓▒▒▒▒▒▓▓▓▓▓██▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓ ▄▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓\r\n"
			+ "   █▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▌  ▄▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▌  ▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓█▌▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓\r\n"
			+ "    ▀▓▓▓▓▓▓▓▓▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▌ ▀▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▀ ▐▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▌\r\n"
			+ "     ▀▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓  ▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▄▄▓▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▓▓▓▓▒▒▒▒▒▒▒▓▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓\r\n"
			+ "       ▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▓▓▓▓▓▓▒▒▒▒▒▓▓▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓\r\n"
			+ "        ▓▓▓▀▀▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▓▓▓▓\r\n"
			+ "             ▀▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▓▓▓▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▓▓▓▒▒▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▒▒▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▓▓▓▓▌\r\n"
			+ "              ▀▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓▒▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓\r\n"
			+ "               █▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓\r\n"
			+ "                █▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓██▀▀▀  ▐███▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▀\r\n"
			+ "                 ████▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓█▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▀█▓▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓       ███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓\r\n"
			+ "                  ████▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓███▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓    ▀▀█▓▓██▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓       ▀▀▀▀███▓█████▓▓▓▓▓▓▓█▓▓▓█▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓\r\n"
			+ "                   ████▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓████▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓        ▀▀█▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓                   ▀▀▀   █▓███▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓███▓▓▓▓▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓\r\n"
			+ "                    ████▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▌▀█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓             ▀▀█▓▓██▓▓▓▓▓▓▓                             ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌    █▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▌\r\n"
			+ "                     ████▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓  ▀▀███████▓▓▓▓███▀  ▐███▓▓▓▓▓▓▓▓▓██▀▀                 ▀▀█▓▓██▓▓▓                             ▀███▓▓████▓▓▓▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓\r\n"
			+ "                      ████▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓     ▀▀▀▀▀▀▀▀▀       ██▀▀▀▀▀▀                              ▀█▀▀                                       ▀▀▀▀▀██▓█▀     ▀▀▀▀▀████▓████▓▓▓▒▒▒▒▒▒▓▓▓▓▓\r\n"
			+ "                       ████▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓                                                                                                                               ▐▓▓▓▓▓▓▓▓▓▒▒▒▓▓▓▓\r\n"
			+ "                        ████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀                                                                                                                              ▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌\r\n"
			+ "                         ████▓▓▓▓▓▓▓██▀▀▀                                                                                                                                   ▀▀▀██▓▓██▓▓▓▓▓\r\n"
			+ "                          █████▀▀▀        ");
>>>>>>> 26dbd0424da1c17b79eb02ba9ff0b650d867e10a
	
	public String cuadroAtaqueAbajo () {
		String cuadroAbajo;
		cuadroAbajo = "└──────────────────────────────┘";
		
		return cuadroAbajo;
	}
	
}
