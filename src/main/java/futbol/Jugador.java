package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		this("Maradona","delantero", 30, 289, 7);
	}
	public boolean jugarConLasManos();
	
	public Jugador( String nombre,int edad, String posicion, short golesMarcados, byte dorsal) {
		super( nombre,edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	boolean jugarConLasManos();
		
	@override
	public String toString() {
		return "El futbolista" + super.getNombre() + " tiene " + super.getEdad() + "juega de " + super.getPosicion() + "con el dorsal" + getDorsal()+ ". Ha marcado" + getGolesMarcados();
	}
	public short getGolesMarcados() {
		return golesMarcados;
	}
	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
}
