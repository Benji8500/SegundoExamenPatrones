package memento;


public class Memento {
	private Document state;

    public Memento(Document stateSaved){
        this.state=stateSaved;
    }

    public Document getState() {
        return state;
    }
}
