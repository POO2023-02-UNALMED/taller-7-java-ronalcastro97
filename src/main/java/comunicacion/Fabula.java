package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza=ensenanza;
		this.interpretacion=interpretacion;
	}
	
	public String getEnseñanza() {
		return ensenanza;
	}

	public void setEnseñanza(String enseñanza) {
		this.ensenanza = enseñanza;
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
