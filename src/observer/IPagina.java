package observer;

public interface IPagina {
    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Video video);
    void notifyObserver(Imagen imagen);

}
