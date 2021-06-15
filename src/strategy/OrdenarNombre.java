package strategy;

import java.util.ArrayList;
import java.util.List;


public class OrdenarNombre implements  IEstrategiaOrdenamiento{

	@Override
	public void ordenar(List<Usuarios> users) {
		
		List<String> nombres = new ArrayList<>();
		for(int i =0; i<users.size();i++) {
			nombres.add(users.get(i).getNombre());
		}
		String smallest = users.get(0).getNombre();
		int index =0;
		for(int i =1; i<users.size();i++) {
			int compare = smallest.compareTo(nombres.get(i));
			if(compare<0) {
				
			}
			
		}
		
	}
    
}
