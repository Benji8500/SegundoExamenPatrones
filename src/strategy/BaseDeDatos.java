package strategy;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {


    private IEstrategiaOrdenamiento estrategiaOrdenamiento;
    private List<Usuarios> users = new ArrayList<>();

    public BaseDeDatos(){}

    public void ordenar() {
    	estrategiaOrdenamiento.ordenar(this.users);
    }

	public IEstrategiaOrdenamiento getEstrategiaOrdenamiento() {
		return estrategiaOrdenamiento;
	}

	public void setEstrategiaOrdenamiento(IEstrategiaOrdenamiento estrategiaOrdenamiento) {
		this.estrategiaOrdenamiento = estrategiaOrdenamiento;
	}

	public List<Usuarios> getUsers() {
		return users;
	}

	public void setUsers(List<Usuarios> users) {
		this.users = users;
	}
    
    
    
}
