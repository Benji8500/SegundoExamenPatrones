package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatEducativo implements ICanal {
	
	private List<Persona> personasChat = new ArrayList<>();

	public void addPersonaChat(Persona per) {
		personasChat.add(per);
	}

    @Override
    public void send(String message, Colleague colleague) {
    	for(Persona p: personasChat) {
    		if (colleague instanceof Estudiante) {
    			p.messageReceived(message);
    			
    			
    		}else if( colleague instanceof Docente) {
    			if (p instanceof Estudiante || p instanceof Docente) {
        			p.messageReceived(message);
    			}
    			
    			
    		}else if( colleague instanceof Administrativos) {
    			p.messageReceived(message);
    			
    		}
    	}
    	 
    }

	@Override
	public void sendDocentes(String message, Colleague colleague) {
		for(Persona p: personasChat) {
    		if (colleague instanceof Estudiante) {
    			
    			if (p instanceof Docente) {
        			p.messageReceived(message);
    			}
    			
    		}
    	}
    	 
		
	}

	@Override
	public void sendAdministrativos(String message, Colleague colleague) {
		for(Persona p: personasChat) {
			if (p instanceof Administrativos ) {
    			p.messageReceived(message);
			}
    	}
    	 
		
	}
}
