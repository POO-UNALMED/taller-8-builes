package futbol;

public class Portero extends Jugador {
	public short golesRecibidos;	
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero", (short)0, dorsal);
		this.golesRecibidos = golesRecibidos;	
	}	
	
	public int compareTo(Portero f) {
		return f.golesRecibidos - this.golesRecibidos;
	}
	
	public String toString(){
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + 
				" con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
	
	
}
