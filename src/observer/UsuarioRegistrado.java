package observer;

public class UsuarioRegistrado implements IUsuario {


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
}
