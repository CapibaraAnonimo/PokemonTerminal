package pokemonTerminalDatos;


public class CuadroAtaquesImprimir {
	
	
	private String cuadroArriba =  "┌──────────────────────────────┐";

	private String cuadroMedio = "│";

	private String cuadroAbajo = "└──────────────────────────────┘";

	public String cuadroAtaqueArriba () {
		
		return cuadroArriba;
	}
	
	public String cuadroAtaqueMedio () {
		
		return cuadroMedio;
	}
	
	public String cuadroAtaqueAbajo () {
		
		return cuadroAbajo;
	}

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
	
	
	
}
