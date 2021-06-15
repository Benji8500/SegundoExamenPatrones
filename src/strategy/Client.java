package strategy;

public class Client {
    public static void main (String[] args){

        BaseDeDatos context= new BaseDeDatos();

        context.setEstrategiaOrdenamiento(new OrdenarCI());
        context.ordenar();

        context.setEstrategiaOrdenamiento(new OrdenarNombre());
        context.ordenar();

        context.setEstrategiaOrdenamiento(new OrdenarFechaProfesion());
        context.ordenar();


    }
}
