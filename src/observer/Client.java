package observer;

public class Client {

    public static void main (String [] args){
        PaginaDeFacebook concreteSubject= new PaginaDeFacebook();

        concreteSubject.attach(new UsuarioRegistrado());
        concreteSubject.attach(new ConcreteObserver2());

        concreteSubject.setAttribute2("este atributo tiene un nuevo valor");
        concreteSubject.setAttribute1("no deberia notificar");
        concreteSubject.setAttribute2("si deberia notificar");
    }



}
