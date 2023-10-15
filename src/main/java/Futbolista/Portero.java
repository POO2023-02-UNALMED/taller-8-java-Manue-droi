package Futbolista;

public class Portero extends  {
	public short golesRecibidos;
	public byte dorsal;
	public final String posicion = "portero";
	
	public Portero() {
		this("Maradona", 30,"delantero", (short) 289, (byte)7);
	}
	public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public String toString() {
		return "El futbolista" + this.getNombre() + " tiene "+ this.getEdad() + "juega de " + this.getPosicion() + "con el dorsal" + this.dorsal() + ". Le han marcado" + this.golesRecibidos();
	}
	public int compareTo(Portero p){
        return Math.abs(this.golesRecibidos-p.golesRecibidos);
	}
	boolean jugarConLasManos() {
		return true;
	}
}
