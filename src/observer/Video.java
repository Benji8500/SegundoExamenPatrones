package observer;

public class Video {
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Video(String titulo) {
		this.titulo = titulo;
	}
	
	public void info () {
		System.out.println("Video: "+ titulo);
	}
	
	
	
}
