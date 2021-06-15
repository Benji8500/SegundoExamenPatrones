package mediator;

public interface ICanal {
    void send( String message, Colleague colleague);
    void sendDocentes( String message, Colleague colleague);
    void sendAdministrativos( String message, Colleague colleague);
}
