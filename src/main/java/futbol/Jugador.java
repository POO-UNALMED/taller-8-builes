package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		this("Maradona", 30, "delantero", (short)289, (byte)7);
	}
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal; 
	}
	
	public int compareTo(Jugador f) {
		return this.getEdad() - f.getEdad();
	}
	
	public String toString(){
		 return "El futbolista "+ this.getNombre() + " tiene " + this.getEdad() +
				 ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}
	
	
	
	
}
