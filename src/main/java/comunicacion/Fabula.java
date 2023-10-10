package comunicacion;

public class Fabula extends Escrito{
	
	private String enseñanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String enseñanza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza=enseñanza;
		this.interpretacion=interpretacion;
	}
	
	public String getEnseñanza() {
		return enseñanza;
	}

	public void setEnseñanza(String enseñanza) {
		this.enseñanza = enseñanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public int palabrasTotales(int parametro) {	
		return 0;
	}
	public String interpretacion() {
		return null;
	}
	public String toString() {
		return null;
	}
}
