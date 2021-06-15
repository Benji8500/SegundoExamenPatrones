package memento;

import java.util.ArrayList;
import java.util.List;


public class VersionHolder {
	private List<Memento> stateSaved= new ArrayList<>();

    public void addMemento(Memento memento){
        stateSaved.add(memento);
    }

    public Memento getMemento(int statePosition){
        return stateSaved.get(statePosition);
    }

	public List<Memento> getStateSaved() {
		return stateSaved;
	}

	public void setStateSaved(List<Memento> stateSaved) {
		this.stateSaved = stateSaved;
	}
    
    

}
