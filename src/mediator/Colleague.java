package mediator;

public abstract class Colleague {
     protected ICanal mediator;

     public Colleague(ICanal mediator){
         this.mediator=mediator;
     }

     public abstract void send(String message);
     public abstract void messageReceived(String message);
}
