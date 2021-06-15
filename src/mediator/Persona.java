package mediator;

public class Persona extends Colleague{
	private String nombre;
	
	public Persona(ICanal mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received C1 > "+message);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
