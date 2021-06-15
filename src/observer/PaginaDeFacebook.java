package observer;

import java.util.ArrayList;
import java.util.List;

public class PaginaDeFacebook implements  IPagina{
    private List<IUsuario> observerList= new ArrayList<>();
    private List<Video> videoList= new ArrayList<>();
    private List<Imagen> imagenList= new ArrayList<>();

    
    public void publishVideo(Video video) {
    	videoList.add(video);
    	this.notifyObserver(video);
    }
    
    public void publishImagen(Imagen imagen) {
    	imagenList.add(imagen);
    	this.notifyObserver(imagen);
    }
    



	@Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
       observerList.remove(observer);
    }

	@Override
	public void notifyObserver(Video video) {
		for(IUsuario user: observerList) {
			user.update("Nuevo video"+ video.getTitulo(),video);
		}
		
	}

	@Override
	public void notifyObserver(Imagen imagen) {
		
		for(IUsuario user: observerList) {
			UsuarioRegistrado parse = (UsuarioRegistrado) user;
			if(parse.getQuieroImagenes()) {
				user.update("Nueva imagen"+ imagen.getTitulo(),imagen);
			}
			
		}
	}



    
}
