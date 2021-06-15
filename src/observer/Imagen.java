package observer;

public class Imagen {
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Imagen(String titulo) {
		this.titulo = titulo;
	}
	
	public void info () {
		System.out.println("Video: "+ titulo);
	}
	
	
	
}
