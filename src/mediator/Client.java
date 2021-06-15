package mediator;

public class Client {

    public static void main (String[] args){
        ChatEducativo mediator= new ChatEducativo();

        Estudiante concreateColleague1 = new Estudiante(mediator);
        Docente concreateColleague2 = new Docente(mediator);
        Administrativos concreateColleague3 = new Administrativos(mediator);

       

        concreateColleague1.send("Hola a todos!");
        System.out.println("***");
        concreateColleague2.send("Hola estudiantes y profes");


    }

}
