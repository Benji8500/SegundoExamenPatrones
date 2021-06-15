package mediator;

public class Estudiante extends Persona {
	private int numMatricula;
	private String nombre;
    public Estudiante(ICanal mediator) {
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

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
}
