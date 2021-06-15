package strategy;

public class Usuarios {
	private int ci;
	private String nombre;
	private String fechaNac;
	private String prof;
	
	
	
	public Usuarios(int ci, String nombre, String fechaNac, String prof) {
		this.ci = ci;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.prof = prof;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	
	

}
