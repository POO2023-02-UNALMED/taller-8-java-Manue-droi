package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public String toString() {
		return "El futbolista" + this.getNombre() + " tiene "+ this.getEdad() + "y juega de " + this.getPosicion() + "con el dorsal" + this.dorsal + ". Le han marcado" + this.golesRecibidos;
	}
	public int compareTo(Portero p){
        return Math.abs(this.golesRecibidos-p.golesRecibidos);
	}
	public boolean jugarConLasManos() {
		return true;
	}
}
