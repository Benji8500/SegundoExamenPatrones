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
    

    private void notifyObserver(Imagen imagen) {
		// TODO Auto-generated method stub
		
	}

	private void notifyObserver(Video video) {
		// TODO Auto-generated method stub
		
	}


	@Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
       observerList.remove(observer);
    }

    /*
    notify observer when the attribute2 is updated
     */
    @Override
    public void notifyObserver() {
        for (IUsuario observer:observerList
             ) {
            observer.update(attribute2);
        }
    }
}
