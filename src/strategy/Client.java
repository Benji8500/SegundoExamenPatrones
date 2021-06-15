package strategy;

public class Client {
    public static void main (String[] args){

        BaseDeDatos context= new BaseDeDatos();

        context.setStrategy(new OrdenarCI());
        context.execute();

        context.setStrategy(new OrdenarNombre());
        context.execute();

        context.setStrategy(new OrdenarFechaProfesion());
        context.execute();


    }
}
