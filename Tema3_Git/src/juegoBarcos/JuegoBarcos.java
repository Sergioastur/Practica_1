package juegoBarcos;

public class JuegoBarcos {
	
	
	private String jugador;
	private Integer victorias;
	
	
	public JuegoBarcos() {
		super();
		// TODO Auto-generated constructor stub
	}


	public JuegoBarcos(String jugador, Integer victorias) {
		super();
		this.jugador = jugador;
		this.victorias = victorias;
	}


	public String getJugador() {
		return jugador;
	}


	public void setJugador(String jugador) {
		this.jugador = jugador;
	}


	public Integer getVictorias() {
		return victorias;
	}


	public void setVictorias(Integer victorias) {
		this.victorias = victorias;
	}

	

	
	
	

}
