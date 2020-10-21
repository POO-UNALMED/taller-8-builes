package futbol;

public class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(){
		this("Maradona", 30, "delantero");
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public int compareTo(Futbolista f) {
		return this.edad - f.edad;
	}
	
	public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + " y juega de " + posicion;
	}
	
	public boolean equals(Futbolista f) {
		if (this.equals(f)) {
			return true;
		}
		return false;
	}
	
	public  boolean jugarConLasManos() {
		if(this.posicion.equals("Portero")) {
			return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}
	
	
		

}
