package memento;


public class VersionCreator {
	private Document state;
	private int index=0;

    public VersionCreator(){}

    public void setState(Document state) {
        System.out.println("**** Set State *****");
        state.info();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("**** Create State *****");
        state.info();
        index++;
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.info();
    }
    
    
    public void revertir(VersionHolder v) {
    	Memento memento;
    	memento = v.getMemento(this.index-2);
    	index--;
    	 this.state=memento.getState();
         System.out.println("**** State Restored *****");
         this.state.info();
    }
    
    public void deshacer(VersionHolder v) {
    	Memento memento;
    	memento = v.getMemento(this.index);
    	index++;
    	 this.state=memento.getState();
         System.out.println("**** State Restored *****");
         this.state.info();
    }

}
