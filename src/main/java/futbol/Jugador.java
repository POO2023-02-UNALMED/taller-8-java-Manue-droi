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
	public boolean jugarConLasManos() {
		return false;
	}
	
	public String toString() {
		return "El futbolista" + this.getNombre() + " tiene " + this.getEdad() + "juega de " + this.getPosicion() + "con el dorsal" + this.dorsal()+ ". Ha marcado" + this.Dorsal();
	}
    public int compareTo(Futbolista f){
        return Math.abs(this.getEdad()-f.getEdad());
    }

	
	
	
}
