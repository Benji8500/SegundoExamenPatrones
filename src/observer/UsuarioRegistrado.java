package observer;

public class UsuarioRegistrado implements IUsuario {
	private String nombre;
	private Boolean quieroImagenes;
	
	


	public UsuarioRegistrado(String nombre, Boolean quieroImagenes) {
		this.nombre = nombre;
		this.quieroImagenes = quieroImagenes;
	}

	@Override
	public void update(String message, Video video) {
		System.out.println(message);
		video.info();
	}

	@Override
	public void update(String message, Imagen imagen) {
		System.out.println(message);
		imagen.info();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getQuieroImagenes() {
		return quieroImagenes;
	}

	public void setQuieroImagenes(Boolean quieroImagenes) {
		this.quieroImagenes = quieroImagenes;
	}
	
	
}
